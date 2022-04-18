# **CİRCLE AREA**

# Information

* **Program to find the area of a circle segment with radius r and measure a of the central angle.**

# Technologies Used

* **JAVA**

# Contents

* The variables **r** and **a** is defined with int.

* The pi value is 3.14 and is defined with double.

* The radius and center angle values of the circle are taken from the user.

* Area, perimeter and center area formulas are defined.

* The area of the circle segment is found by entering the area of the circle and the center angle values.

<br />

```Java

        public class Circlearea{

        public static void main(String[] args) {

        int r, a;

        double pi = 3.14;

```

```Java

         Scanner input = new Scanner(System.in);

         System.out.print("Enter The Radius of The Circle : ");

         r = input.nextInt();

         System.out.print("Enter The Central Angle : ");

         a = input.nextInt();

```
```Java

         double area = pi * r * r;

         double circumference = 2 * pi * r;

         double centralArea = (pi * (r*r) * a) / 360;


         System.out.println("Area of The Circle : " + area);

         System.out.println("Circumference of The Circle : " + circumference);

         System.out.println("Area of The Circle Segment : " + centralArea);

```

```bash

        Enter The Radius of The Circle : 3
        Enter The Central Angle : 4
        Area of The Circle :28.259999999999998
        Circumference of The Circle :18.84
        Area of The Circle Segment :0.314

```
<br />

# LINK

* Click here https://github.com/Fogo9/CircleArea.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
