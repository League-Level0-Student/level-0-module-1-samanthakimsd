void setup(){
  size(500,400);
PImage face = loadImage("face.jpeg");
face.resize(width, height);
image(face, 0, 0);
}
void draw(){
 fill(mouseX, mouseY,55);
 ellipse(324,171,40,30);
 ellipse(274, 157, 40,30);
 fill(#3003FF);
 ellipse(325, 171, 30, 20);
 ellipse(275, 155, 30, 20);
 fill(#000000);
 ellipse(274, 155, 20, 10);
 ellipse(325, 171, 20, 10);
 fill(#FFFED6);

  if(mousePressed){
 println(mouseX+" "+mouseY);
 }
}