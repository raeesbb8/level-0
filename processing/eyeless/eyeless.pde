void setup()
{
  size(1280, 600);
  PImage face = loadImage("eyeless.jpg");
  image(face, 0, 0);
}
void draw()


{
  println(mouseX);
  fill(random(250),random(250),random(250));
  ellipse(760, 250, 150, 150);
  fill(0,0,0);
  ellipse(760, 250, 100, 100);
  
 
}

