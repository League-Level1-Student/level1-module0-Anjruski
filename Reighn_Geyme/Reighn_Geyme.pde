int score = 0;
int Y = 30;
int X = 500;
void setup() {
size(1000, 500);
}
void draw() {
  background(100, 100, 250);
fill(0, 0, 100);
stroke(0, 0, 100);
ellipse(X, Y, 15, 15);
triangle(X, Y-20, X-5, Y-6, X+5, Y-6);
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
Y+=220;
if (Y == 430) {
checkCatch(X); 
Y = 30;
X = (int)random(400,450);
 
}
rect (mouseX, 400, 100, 50);

}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }
