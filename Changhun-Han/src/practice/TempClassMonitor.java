package src.practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.IntStream;

public class TempClassMonitor {

    public int solution(int n, int[][] students) {
        Map<Integer, Student> map = new HashMap<>();
        for (int grade = 1; grade <= 5; grade++) {
            initClassrooms(n, students, map, grade);
            computeSameClassroom(n, map);
        }
        return getTempClassMonitor(map);
    }

    private void initClassrooms(int n, int[][] students, Map<Integer, Student> map, int grade) {
        if (grade == 1) {
            IntStream.range(0, n).forEach(student -> map.put(student, Student.of(students[student][grade - 1])));
        } else {
            IntStream.range(0, n).forEach(student -> map.get(student).furtherEducation(students[student][grade - 1]));
        }
    }

    private void computeSameClassroom(int n, Map<Integer, Student> map) {
        for (int student = 0; student < n; student++) {
            for (int otherStudent = 0; otherStudent < n; otherStudent++) {
                if (student == otherStudent) {
                    continue;
                }
                if (map.get(student).equals(map.get(otherStudent))) {
                    map.get(student).incrementMatchCount();
                }
            }
        }
    }

    private int getTempClassMonitor(Map<Integer, Student> map) {
        return Collections.max(map.entrySet(),
                Entry.comparingByValue(Comparator.comparingInt(Student::getMatchCount)))
            .getKey() + 1;
    }

    private static class Student {

        private int classroom;
        private int matchCount;

        private Student(int classroom) {
            this.classroom = classroom;
        }

        private static Student of(int classroom) {
            return new Student(classroom);
        }

        private void furtherEducation(int classroom) {
            this.classroom = classroom;
        }

        private void incrementMatchCount() {
            this.matchCount++;
        }

        private int getMatchCount() {
            return matchCount;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Student student = (Student) o;
            return classroom == student.classroom;
        }

        @Override
        public int hashCode() {
            return Objects.hash(classroom);
        }

    }

}
