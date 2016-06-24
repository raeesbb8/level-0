void setup()
{
  size(500, 500);
  noStroke();
  fill(250, 0, 0);
  ellipse(250, 250, 300, 300);
  fill(255, 255, 255);
  ellipse(250, 250, 250, 250);
  fill(250, 0, 0);
  ellipse(250, 250, 150, 150);
  fill(255, 255, 255);
  ellipse(250, 250, 75, 75);
  fill(250, 0, 0);
  ellipse(250, 250, 37, 37);
  fill(255, 255, 255);
  ellipse(250, 250, 37, 37);
  fill(250, 0, 0);
  ellipse(250, 250, 18, 18);
  fill(255, 255, 255);
  ellipse(250, 250, 9, 9);
  int d=300;
  for (int i=0; i<5; i=i+1)
  {
    
    fill(255, 0, 0);
    ellipse(250, 250, d, d);
    fill(255, 255, 255);
    ellipse(250, 250, d-10, d-10);
    d=d-20;
  }

}

