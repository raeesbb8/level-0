



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
  int x = mouseX;
  if(x>785){
    x=785;
  }
  if(x<735){
    x=735;
  }
  int y =mouseY;
    if(y>275){
    y=275;
  }
   if(y<225){
    y=225;
  }
  ellipse(x, y, 100, 100);
  println(mouseX);
  
 
}

