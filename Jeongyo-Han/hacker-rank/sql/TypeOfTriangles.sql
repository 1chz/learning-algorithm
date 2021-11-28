select 
   CASE 
      WHEN A>=B+C OR B>=A+C OR C>=A+B THEN 'Not A Triangle'
      WHEN A=B AND B=C THEN 'Equilateral' 
      WHEN A=B OR B=C OR C=A THEN 'Isosceles' 
      ELSE 'Scalene' END
from TRIANGLES;