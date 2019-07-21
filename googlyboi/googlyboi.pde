 PImage face;
 void setup() {
    face = loadImage("eyes.jpg");
    size(1000,1000);
    face.resize(width,height);
    
  }
   
  void draw(){background(face);
  fill(255,255,255);
  ellipse(270, 485, 450,450);
  ellipse(730, 485, 450,450);
  fill(0,0,0);
  if (mouseX >= 406 && mouseX <= 599 && mouseY >= 385 && mouseY <= 587){
  ellipse(mouseX - 230, mouseY, 250,250);
  ellipse(mouseX + 230, mouseY, 250,250);
  }
println(mouseX + "mouseY" + mouseY);

//496  385
//599  473
//493  587
//399  486
}
