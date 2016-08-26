/* 1. Change the code below to make the rocket ship take off. */
/* 2. Add a moon and stars to the sky. */

int x = 400;
int y = 600;

void setup() {
  background(0, 0, 40);
  size(800, 800);
}

void draw() {
  fill(random(255), 0, 0);
  ellipse(x, y + 140, 100, 100);
  fill(248, 128, 0);
  ellipse(x, y + 115, 80, 80);
  fill(255, 153, 0);
  ellipse(x, y + 95, 45, 45);
  fill(100, 100, 100);
  triangle(x, y + 200, x + 90, y + 200, x - 90, y + 200);
  y=y-10;
}


