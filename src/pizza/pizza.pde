PImage peperoni;
void setup(){
  size(500,400);
  fill(#EACAAF);
  ellipse(240,182, 300,300);
  fill(#FF0303);
  ellipse(240,182, 250,250);
  fill(#FFFED6);
  ellipse(240,182, 230,230);
   peperoni = loadImage("peperoni.png");
}
void draw(){

peperoni.resize(40,40);
  if(mousePressed){
 image(peperoni, mouseX, mouseY);
 }
}