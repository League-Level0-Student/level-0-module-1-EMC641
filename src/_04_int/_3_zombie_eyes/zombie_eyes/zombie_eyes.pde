
void setup() {

  size(500,500);
  PImage face = loadImage("face.jpeg");
  face.resize(500,500);
  image(face, 0,0);
  fill(227,25,66);
  ellipse(150,275  ,125,125);
  fill(0,0,0);
  ellipse(150,275  ,25,25);

  fill(227,25,66);
  ellipse(350,275  ,125,125);
  fill(0,0,0);
  ellipse(350,275  ,25,25);
  
}
void draw() {

}
