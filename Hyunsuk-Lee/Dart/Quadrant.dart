import 'dart:io';
//dart
void main(){
  var x = int.parse(stdin.readLineSync());
  var y = int.parse(stdin.readLineSync());
  var quadrant = (x > 0) ? ((y > 0) ? 1 : 4) : ((y > 0) ? 2 : 3);
  stdout.write(quadrant);
}
