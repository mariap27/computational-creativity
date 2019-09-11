import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class essay extends PApplet {

PFont teletext;
PFont joined;

PImage tiburon;
PImage interrogacion;
PImage desktop17;
PImage desktop7;
PImage tarsila0;
PImage tarsila1;
PImage tarsila2;
PImage smiley;
PImage smiley2;
PImage angry;
PImage angry2;

int si = 0;
int no = 0;

float i = 1000;
float j;
float b = -width;
int a = 0;
boolean parpadear = true;
boolean parpRed = false;
boolean parpBlue = false;
boolean parpGreen = false;
boolean parpMagenta = false;
boolean paa = false;
int parp;
int diapositiva;
int rand = 0;

public void setup(){
  
  textAlign(CENTER);
  background(0);
  noStroke();
  teletext = createFont("MODE7GX0.TTF", 128);
  joined = createFont("joined.otf", 32);
  diapositiva = 0;
  tiburon = loadImage("tiburon2.png");
  interrogacion = loadImage("interrogacion.png");
  desktop17 = loadImage("desktop17.png");
  desktop7 = loadImage("desktop7.png");
  tarsila0 = loadImage("tarsilaPequeño.png");
  tarsila1 = loadImage("tarsilaPequeño2.png");
  tarsila2 = loadImage("tarsilaPequeño3.png");
  smiley = loadImage("smiley.png");
  smiley2 = loadImage("smiley2.png");
  angry = loadImage("angry.png");
  angry2 = loadImage("angry2.png");

}

public void draw(){
  if (parpadear && parpRed) parp = color(255, 0, 0);
  else if(parpadear && parpBlue) parp = color(0, 0, 255);
  else if(parpadear && parpGreen) parp = color(0, 255, 0);
  else if(parpadear && parpMagenta) parp = color(255, 0, 255);
  else if (parpadear) parp = color(255);
  else parp = color(0);
  a++;
  if(a == 30){
    parpadear = !parpadear;
    a = 0;
  }

  if (diapositiva == 0) slide();
  else if(diapositiva == 1) slide1();
  else if(diapositiva == 2) slide2();
  else if(diapositiva == 3) {
    slide2();
    slide3();
  }
  else if(diapositiva == 4) slide4();
  else if(diapositiva == 5) {
    slide4();
    slide5();
  }
  else if(diapositiva == 6) {
    slide4();
    slide5();
    slide6();
  }
  else if (diapositiva == 7) slide7();
  else if(diapositiva == 8) {
    slide7();
    slide8();
  }
  else if(diapositiva == 9) {
    slide7();
    slide8();
    slide9();
  }
  else if(diapositiva == 209) slide209();
  else if(diapositiva == 210) {
    slide209();
    slide210();
  }
  else if(diapositiva == 2009) slide2009();
  else if(diapositiva == 2010) slide2010();
  else if(diapositiva == 2011) {
    slide2010();
    slide2011();
  }
  else if (diapositiva == 2012) slide2012();
  else if (diapositiva == 2013){
    slide2012();
    slide2013();
  }
  else if (diapositiva == 211 || diapositiva == 2014) slide2014();
  else if (diapositiva == 2015) {
    slide2014();
    slide2015();
  }
  else if (diapositiva == 2215) slide2215();
  else if (diapositiva == 2216) {
    slide2215();
    slide2216();
  }
  else if (diapositiva == 4015 && no == 1) slide4015();
  else if (diapositiva == 4016){
    slide4015();
    slide4016();
  }
  else if (diapositiva == 4015 && no == 2) slide4017();
  else if (diapositiva == 4017) slide4017();
  else if (diapositiva == 4018) {
    slide4017();
    slide4018();
  }
  else if (diapositiva == 4019) slide4019();
  else if (diapositiva == 4020) {
    slide4019();
    slide4020();
  }
  else if (diapositiva == 4021 || diapositiva == 2217) slide4021();
  else if (diapositiva == 4022) {
    slide4022();
    slide4021();
  }
  else if (diapositiva == 4023) {
    slide4022();
    slide4021();
    slide4023();
  }
  else if (diapositiva == 4024) {
    slide4022();
    slide4021();
    slide4024();
  }
  else if (diapositiva == 4224) slide4224();
  else if (diapositiva == 4225){
    slide4224();
    slide4225();
  }
  else if(diapositiva == 4226) slide4226();


  else if (diapositiva == 6024 && no == 1) slide6024();
  else if (diapositiva == 6025 && no == 1) slide6025();
  else if (diapositiva == 6026) slide6026();
  else if (diapositiva == 6027) slide6027();
  else if (diapositiva == 6028) slide6028();
  else if (diapositiva == 6029) {
    slide6028();
    slide6029();
  }
  else if (diapositiva == 6030){
    slide6028();
    slide6029();
    slide6030();
  }

  else if (diapositiva == 6031) {
    slide6028();
  }
  else if (diapositiva == 6032) {
    slide6028();
    slide6032();
  }
  else if (diapositiva == 6033) {

    slide6028();
    slide6032();
  }

  else if(diapositiva == 6034 || diapositiva == 4227) exit();


  else if (diapositiva == 6024 && no == 2) {
    slide6026();
  }
  else if (diapositiva == 6024) {
    slide6027();
  }
}



public void mouseClicked(){
  if(mouseButton == LEFT) diapositiva++;
  else if(mouseButton == RIGHT) diapositiva--;

}

public void keyPressed(){
  if(key == 'y') diapositiva+=200;
  if(key == 'n') {
    diapositiva+=2000;
    no++;
    println(no);
    println(diapositiva);
  }
}


public void slide(){
    j = i + 400;
    background(0);
    fill(255, 0, 255);
    textFont(teletext, 64);
    text("\"COMPUTATIONAL CREATIVITY\"", i, 260);
    textFont(joined, 32);
    fill(255, 0, 0);
    text("click to start;", j, 300);
    i-=3;
    if(i == -550) i = width*2;
    fill(parp);
    textFont(teletext, 16);
    text("if (mouseClicked()) start();", width/2, 500);

}

public void slide1(){
  background(0);
  parpRed = true;
  fill(parp);
  textAlign(CENTER);
  text("?¿¿¿¿=(?===&%$???!·!!¿¿¿¿¿)", width/2, 70);
  textAlign(RIGHT);
  textFont(teletext, 32);
  fill(255, 255, 0);
  text("¿ What can I do...", 400, 120);
  textAlign(LEFT);
  text("...as a program...?", 200, 170);
  fill(parp);
  textAlign(CENTER);
  text("??=$$?&??$$==?¿¿¿¿¿???/%$???", width/2, 220);

  i = width;
}

public void slide2(){
  fill(0);
  rect(0, 210, width, height);
  textFont(teletext, 32);
  textAlign(RIGHT);
  fill(255);
  text("I can do", 200, 270);
  textAlign(LEFT);
  fill(0, 255, 0);
  text("whatever you teach me...", i, 320);
  parpRed = true;
  fill(parp);
  textAlign(CENTER);
  text("!!!!!!!!!!!!!!!!!!!!!!!!!!!", width/2, 70);
  text("!!!!!!!!!!!!!!!!!!!!!!!!!!!!", width/2, 220);

  i-=3;
  if(i == -400) i = width;
}

public void slide3(){
  textFont(joined, 64);
  fill(255, 0, 255);
  text("Iwanttobecreative", width/2, 420);
  textFont(teletext, 32);
  parpRed = !parpRed;
  parpBlue = true;
  fill(parp);
  rect(100, 470, 420, 80);
  fill(255, 255, 0);
  text("TEACH ME OR CLOSE ME", width/2, 520);
  j = 0;
  b = width+100;
}

public void slide4(){

  background(0);
  textFont(teletext, 32);
  fill(0, 255, 255);
  textAlign(RIGHT);
  text("I want to be", 260, 100);
  textAlign(LEFT);
  fill(255, 0, 0);
  textFont(teletext, 64);
  text("CREATIVE", 280, j - 500);
  text("CREATIVE", 280, j - 450);
  text("CREATIVE", 280, j - 350);
  text("CREATIVE", 280, j - 250);
  text("CREATIVE", 280, j - 150);
  text("CREATIVE", 280, j - 400);
  text("CREATIVE", 280, j - 300);
  text("CREATIVE", 280, j - 200);
  text("CREATIVE", 280, j - 100);
  text("CREATIVE", 280, j - 50);
  text("CREATIVE", 280, j);

  fill(0);
  rect(250, 0, width, 55);
  rect(250, 120, width, height);

  j+=2;
  if(j > height + 50) j = 0;

}

public void slide5(){
  parpGreen = true;
  parpBlue = false;
  textFont(teletext, 128);
  fill(255, 0, 255);
  textAlign(CENTER);
  text("CREATIVE", width/2-10, 350);
  textFont(teletext, 32);
  fill(255);
  textAlign(CENTER);
  text("I am meant to be", width/2, 200);
  fill(parp);
  text("??)  %$==???????¡¡¿¿¿????", width/2, 300);
  text("¿¿$=)??!!????? =)(/&%)??)&", width/2, 325);
  b-=3;
  if(b < 0) b = width+300;
}

public void slide6(){
  textFont(joined, 64);
  fill(0, 0, 255);
  text("TEACH OR CLOSE", width/2, 500);
  textFont(teletext, 32);
  fill(255, 255, 0);
  text("PRESS TO START TEACHING", width/2, 500);
  textFont(teletext, 16);
  fill(parp);
  text("teach or close", width/2, 520);
  i = width*2;
  j = i;
}

public void slide7(){
  parpRed = true;
  background(0);
  textFont(teletext, 32);
  fill(255, 255, 0);
  text("Do you consider shocking and impresive artworks creative???", i, 100);
  fill(parp);
  text("??&/·?%$·??%&/$?shocking and impresive = ?? === creative???", j, 125);
  i-=3;
  if(j > 400) j = i;
  if (i < -width) i = width*2;

}

public void slide8(){

  text("???&·??¿?¿?¿?¿?    ¿¿¿????  ???  ?????¿¿    ¿¿¿¿¿?¿?¿??¿???¿?¿??)???", i, 50);
  image(tiburon, 0, 150);
  textFont(joined, 16);
  text("The Physical Impossibility of \nDeath in the Mind of Someone Living", width/3, 400);
}

public void slide9(){
  textAlign(CENTER);
  fill(0, 0, 255);
  rect(160, 165, 350, 50);
  textFont(teletext, 32);
  fill(0, 255, 0);
  text("is this CREATIVE?", width/2+20, 200);
  fill(0, 255, 255);
  text("Press \n 'Y' for YES or 'N' for NO", width/2, 550);
  j = 10;
}

public void slide209(){
  if(mouseButton == RIGHT) diapositiva -= 200;
  parpGreen = true;
  background(0);
  fill(parp);
  textAlign(LEFT);
  text(">\n>\n>\n>\n>\n>\n>\n> defining creativity..._ \n> implementing systems that\n>     exhibit creativity..._", 10, j);
}

public void slide210(){
  textAlign(LEFT);
  textFont(teletext, 32);
  parpRed = false;
  parpGreen = true;
  if(j > -290) j--;
  text(">\n>\n>\n>\n>\n>\n>\n> generating next \n>     _creative_ output..._", 10, j + 295);
}

public void slide2009(){
  textAlign(CENTER);
  textFont(teletext, 32);
  background(0);
  fill(parp);
  text("...", width/2, height/2);
  if(mouseButton == RIGHT) diapositiva -= 2000;
  i=width*2;
}

public void slide2010(){
  textAlign(CENTER);
  background(0);
  textFont(joined, 64);
  fill(parp);
  text("I CAN BE CREATIVE", width/2, height/2);
  textFont(teletext, 32);
  fill(0, 255, 255);
  text("I thought you would consider this original and creative...", i, height/2);
  i-=5;
  if(i < -width) i = width*2;
}

public void slide2011(){
  textAlign(CENTER);
  textFont(teletext, 16);
  fill(0, 255, 0);
  text("¿¿??!%   ¿¿??·$ %&!?¿??!%¿¿??   ¿¿?? ·$ %&!?¿??\n¿¿??    $ %&!?¿??!%?¿??!%¿¿??¿¿??\n¿!¿¿??·$ %&! ?¿??!%¿¿??  ?¿?? %&¿!%¿??·$¿??", width/2, height/4);
  text("¿¿??!  ¿¿??·$ %&!?¿??!%¿¿??%¿¿?? ·$ %&  !?¿??\n¿¿ ??·$ %&!¿ ¿  ??·$ %&!?¿??!%¿¿???¿??!%¿¿??\n¿!?¿?? %&¿!%¿??·?$   ¿¿??·$ %??!%¿¿??¿??", width/2, height/4*3);
  textFont(teletext, 128);
  fill(255, 0, 255);
  text("???", 150, 550);
  textFont(teletext, 64);
  text("???", 500, 150);
  fill(0, 0, 255);
  text("HOW  CAN", 200, 200);
  text("I     BE", width/2, 300);
  rect(275, 350, 330, 30);
  fill(255, 255, 0);
  text("CREATIVE", 440 ,400);
  i-=5;
}

public void slide2012() {
  textFont(teletext, 32);
  parpGreen = false;
  parpRed = true;
  background(0);
  fill(parp);
  textAlign(LEFT);
  text(">\n>\n>\n>\n>\n>\n>\n> defining creativity..._ \n> implementing systems that\n>     exhibit creativity..._", 10, j);
}

public void slide2013(){
  textAlign(LEFT);
  textFont(teletext, 32);
  parpGreen = false;
  parpRed = true;
  textFont(teletext, 32);
  if(j > -290) j--;
  text(">\n>\n>\n>\n>\n>\n>\n> generating next \n>     _creative_ output..._", 10, j + 295);
  i = width*2;
}

public void slide2014() {
  if(diapositiva == 211) diapositiva = 2014;
  fill(255, 255, 0);
  background(0);
  if(diapositiva == 2015) {
    image(desktop7, 50, 50);
    fill(0);
  } else {
    image(interrogacion, -100, 0);
    fill(255, 255, 0);
  }
  if(!parpadear) background(0);
  textFont(teletext, 32);
  textAlign(CENTER);
  if(!parpadear && diapositiva == 2015)fill(255, 0, 0);
  text("Using existing elements in a way they weren't meant to", i, 100);
  i-=2;
  paa = !paa;
  if(i < - width) i = width * 2;
}

public void slide2015(){
  fill(0, 255, 0);
  textFont(teletext, 16);
  textAlign(LEFT);
  image(interrogacion, random(-200, width), random(-200, height));
  text("if (using existing elements in a way they weren't meant to) {\n  press 'Y';\n} else if (false) {\n  press 'N';\n}", 20, 500);
  textFont(joined, 96);
  textAlign(CENTER);
  parpRed = false;
  parpGreen = false;
  parpMagenta = true;
  fill(parp);
  fill(0, 255, 255);
  if(parpadear && paa) fill(0);
  else if(parpadear) fill(255, 0, 255);
  text("MATTHEW MIRAPAUL\nWith the Desktop as a Canvas", 200, 200);
  j = 10;
}

public void slide2215() {
  if(mouseButton == RIGHT) diapositiva -= 200;
  if(diapositiva < 2215) diapositiva = 2215;
  background(0);
  textFont(teletext, 32);
  parpGreen = true;
  background(0);
  fill(parp);
  textAlign(LEFT);
  text(">\n>\n>\n>\n>\n>\n>\n> defining creativity..._ \n> implementing systems that\n>     exhibit creativity..._", 10, j);
}

public void slide2216(){
  textAlign(LEFT);
  textFont(teletext, 32);
  parpRed = false;
  parpGreen = true;
  if(j > -290) j--;
  text(">\n>\n>\n>\n>\n>\n>\n> generating next \n>     _creative_ output..._", 10, j + 295);
  //if(mouseButton == LEFT) diapositiva = 4021;
}

public void slide4015() {
  if(mouseButton == RIGHT) diapositiva -= 2000;
  if(diapositiva < 4015) diapositiva = 4015;
  textAlign(CENTER);
  background(0);
  textFont(joined, 64);
  parpRed = true;
  fill(parp);
  text("I CAN BE CREATIVE", width/2, height/2);
  textFont(teletext, 32);
  fill(0, 255, 255);
  text("I thought you would consider this original and creative...", i, height/2);
  i-=5;
  if(i < -width) i = width*2;
}

public void slide4016(){
  textAlign(CENTER);
  textFont(teletext, 16);
  fill(0, 255, 0);
  text("¿¿??!%   ¿¿??·$ %&!?¿??!%¿¿??   ¿¿?? ·$ %&!?¿??\n¿¿??    $ %&!?¿??!%?¿??!%¿¿??¿¿??\n¿!¿¿??·$ %&! ?¿??!%¿¿??  ?¿?? %&¿!%¿??·$¿??", width/2, height/4);
  text("¿¿??!  ¿¿??·$ %&!?¿??!%¿¿??%¿¿?? ·$ %&  !?¿??\n¿¿ ??·$ %&!¿ ¿  ??·$ %&!?¿??!%¿¿???¿??!%¿¿??\n¿!?¿?? %&¿!%¿??·?$   ¿¿??·$ %??!%¿¿??¿??", width/2, height/4*3);
  textFont(teletext, 128);
  fill(255, 0, 255);
  text("???", 150, 550);
  textFont(teletext, 64);
  text("???", 500, 150);
  fill(0, 0, 255);
  text("HOW  CAN", 200, 200);
  text("I     BE", width/2, 300);
  rect(275, 350, 330, 30);
  fill(255, 255, 0);
  text("CREATIVE", 440 ,400);
  i-=5;
  j = width*2;
  b = -width;
  //if(mouseButton == LEFT) diapositiva = 4019;
}

public void slide4017(){
  if (diapositiva != 4018) diapositiva = 4017;
  parpRed = true;
  background(0);
  fill(255, 255, 0);
  rect(60, 285, 500, 30);
  textFont(joined, 128);
  fill(parp);
  textAlign(CENTER, CENTER);
  text("NO HELP\nNO HELP\nNO HELP", width/2, 300);

  fill(0, 0, 255);
  textFont(teletext, 32);
  text("I    can    only   be\nC  R  E  A  T  I  V  E\nif you teach me how to",width/2, 300);
  textFont(teletext, 16);
  fill(0, 255, 0);
  textAlign(PApplet.parseInt(j), 50);
  text("TEACH OR CLOSE  &$¡¡¡ TEACH OR CLOSE   =!!@# TEACH OR CLOSE!!!", j, 50);
  text("/% ! TEACH OR CLOSE%!!·  ( TEACH OR CLOSE =(/$·¡¡¡ TEACH OR CLOSE!!!", j, 70);
  textAlign(PApplet.parseInt(b), 0);
  text("TEACH OR CLOSE )&$¡¡¡ TEACH OR CLOSE =!!@# TEACH OR CLOSE!!!", b, 600);
  text("    /% ! TEACH OR CLOSE %!!·( TEACH OR CLOSE    =(/$·¡¡¡ TEACH OR CLOSE!!!", b, 570);

  j-=5;
  b+=5;
  if (j < -width) j = width*2;
  if (b > width) b = -width;

}

public void slide4018(){
  fill(255, 0, 255);
  textFont(teletext, 64);
  textAlign(CENTER);
  text("TEACH", width/2, height*5/16);
  text("TEACH", width/2, height*12/16);
  diapositiva = 4018;
}

public void slide4019() {
  if(diapositiva != 4020) diapositiva = 4019;
  if (j>10) j = 10;
  textFont(teletext, 32);
  parpGreen = false;
  parpRed = true;
  background(0);
  fill(parp);
  textAlign(LEFT);
  text(">\n>\n>\n>\n>\n>\n>\n> defining creativity..._ \n> implementing systems that\n>     exhibit creativity..._", 10, j);
}

public void slide4020(){
  textAlign(LEFT);
  textFont(teletext, 32);
  parpGreen = false;
  parpRed = true;
  textFont(teletext, 32);
  if(j > -290) j--;
  text(">\n>\n>\n>\n>\n>\n>\n> generating next \n>     _creative_ output..._", 10, j + 295);
  i = 500;

}

public void slide4021(){
  textAlign(LEFT);
  if(diapositiva < 4022) diapositiva = 4021;
  if(diapositiva < 4022) background(0);
  textFont(teletext, 32);
  fill(0, 0, 255);
  rect(i-10, 160, 1500, 40);
  fill(255, 255, 0);
  text("What about symbolizing && representing the world in a way never seen before??", i, 190);
  i-=3;
  if (i < -1600) i = width;
}

public void slide4022(){
  background(0);
    textAlign(CENTER,CENTER);
    textFont(joined, 64);
    fill(parp);
    parpRed = true;
    text("LOOK  AT\nME BEING\nCREATIVE",width/2-10, height/2-10);
    fill(255);
    text("LOOK  AT\nME BEING\nCREATIVE", width/2+10, height/2+10);
    fill(255, 0, 255);
    textFont(joined, 32);
    text("Tarsila do Amaral", width/2+ 5, 100);


  if(rand < 30){
    image(tarsila0, 0, i);
    image(tarsila1, 206, i+ 800);
    image(tarsila2, 412, i+ 1000);
    image(tarsila0, 206, i + 400);
    image(tarsila1, 412, i + 200);
    image(tarsila2, 0, i +600);
  } else if (rand < 60){
    image(tarsila0, 206, i + 600);
    image(tarsila1, 412, i + 800);
    image(tarsila2, 0, i );
    image(tarsila0, 206, i + 200);
    image(tarsila1, 412, i + 1000);
    image(tarsila2, 0, i +400);
  } else {
    image(tarsila0, 412, i+1000);
    image(tarsila1, 0, i+ 600);
    image(tarsila2, 206, i+400);
    image(tarsila0, 206, i + 800);
    image(tarsila1, 412, i + 200);
    image(tarsila2, 0, i);
    if (rand > 90) rand = 0;
  }
  i-=3;
  rand++;
}

public void slide4023(){
  textFont(teletext, 32);
  fill(0);
  rect(40, 470, 550, 80);
  fill(0,255,0);
  textAlign(CENTER);
  text("did I finally achieve being\n???  C R E A T I V E  ???", width/2, 500);
}

public void slide4024() {
  textFont(teletext, 32);
  fill(0);
  rect(100, 470, 440, 80);
  fill(0, 255, 0);
  textAlign(LEFT);
  text("if(key == 'Y') true;\nif(key == 'N') false;", 120, 500);
}

public void slide6024(){
  if(mouseButton == RIGHT) diapositiva -= 2000;
  if(diapositiva < 6024) diapositiva = 6024;
  textAlign(CENTER);
  background(0);
  textFont(joined, 64);
  parpRed = true;
  fill(parp);
  text("I CAN BE CREATIVE", width/2, height/2);
  textFont(teletext, 32);
  fill(0, 255, 255);
  text("I thought you would consider this original and creative...", i, height/2);
  i-=5;
  if(i < -width) i = width*2;
}

public void slide6025(){
  textAlign(CENTER);
  textFont(teletext, 16);
  fill(0, 255, 0);
  text("¿¿??!%   ¿¿??·$ %&!?¿??!%¿¿??   ¿¿?? ·$ %&!?¿??\n¿¿??    $ %&!?¿??!%?¿??!%¿¿??¿¿??\n¿!¿¿??·$ %&! ?¿??!%¿¿??  ?¿?? %&¿!%¿??·$¿??", width/2, height/4);
  text("¿¿??!  ¿¿??·$ %&!?¿??!%¿¿??%¿¿?? ·$ %&  !?¿??\n¿¿ ??·$ %&!¿ ¿  ??·$ %&!?¿??!%¿¿???¿??!%¿¿??\n¿!?¿?? %&¿!%¿??·?$   ¿¿??·$ %??!%¿¿??¿??", width/2, height/4*3);
  textFont(teletext, 128);
  fill(255, 0, 255);
  text("???", 150, 550);
  textFont(teletext, 64);
  text("???", 500, 150);
  fill(0, 0, 255);
  text("HOW  CAN", 200, 200);
  text("I     BE", width/2, 300);
  rect(275, 350, 330, 30);
  fill(255, 255, 0);
  text("CREATIVE", 440 ,400);
  i-=5;
  j = width*2;
  b = -width;
}

public void slide6026(){
  if(diapositiva < 6026) diapositiva = 6026;
  parpRed = true;
  background(0);
  fill(255, 255, 0);
  rect(60, 285, 500, 30);
  textFont(joined, 128);
  fill(parp);
  textAlign(CENTER, CENTER);
  text("NO HELP\nNO HELP\nNO HELP", width/2, 300);

  fill(0, 0, 255);
  textFont(teletext, 32);
  text("I    can    only   be\nC  R  E  A  T  I  V  E\nif you teach me how to",width/2, 300);
  textFont(teletext, 16);
  fill(0, 255, 0);
  textAlign(PApplet.parseInt(j), 50);
  text("TEACH OR CLOSE  &$¡¡¡ TEACH OR CLOSE   =!!@# TEACH OR CLOSE!!!", j, 50);
  text("/% ! TEACH OR CLOSE%!!·  ( TEACH OR CLOSE =(/$·¡¡¡ TEACH OR CLOSE!!!", j, 70);
  textAlign(PApplet.parseInt(b), 0);
  text("TEACH OR CLOSE )&$¡¡¡ TEACH OR CLOSE =!!@# TEACH OR CLOSE!!!", b, 600);
  text("    /% ! TEACH OR CLOSE %!!·( TEACH OR CLOSE    =(/$·¡¡¡ TEACH OR CLOSE!!!", b, 570);

  j-=5;
  b+=5;
  if (j < -width) j = width*2;
  if (b > width) b = -width;
}

public void slide6027(){
  textFont(teletext, 16);
  if(diapositiva < 6027) diapositiva = 6027;
  background(0);
  parpRed=true;
  fill(parp);
  text("...", width/2, height/2);
  i = -width;
  j = -200;
}

public void slide6028(){
  background(0);
  textAlign(CENTER, CENTER);
  parpRed=true;
  textFont(joined, 32);
  fill(parp);
  text("...", width/2, height/2);
  text("...I don't understand this...", width/2, 100);
  text("...I don't understand this...", width/2, 520);
  textFont(joined, 32);
  text(" WHAT WTA  J2 3 U90D&//3··%& F2OP 4%/$%/=E F65 43546786", i, 130);
  text(" WHAT WTA  J2 3 U90D&//3··%& F2OP 4%/$%/=E F65 43546786", j, 490);
  if(!parpadear) {
    image(angry, width/2, height/4);
    fill(0, 255, 0);
    text("...I don't understand this...", width/2, 100);
    text("...I don't understand this...", width/2, 520);
    text(" WHAT WTA  J2 3 U90D&//3··%& F2OP 4%/$%/=E F65 43546786", i+30, 160);
    text(" WHAT WTA  J2 3 U90D&//3··%& F2OP 4%/$%/=E F65 43546786", j+ 30, 510);
  }
  if(parpadear) image(angry2, 0, height/4);
}

public void slide6029() {
  textFont(teletext, 32);
  fill(255, 0, 255);
  rect(35, 230, 550, 130);
  fill(0, 255, 0);
  text("Why is my CREATIVITY \n QUESTIONED...?", width/2, 270);
  fill(parp);
  text("WHY =)/ !=%=  QUESTIONED...?", width/2, 330);
}

public void slide6030(){
  fill(255, 0, 255);
  rect(35, 230, 550, 130);
  fill(0, 255, 0);
  text("if you made me to be \n CREATIVE", width/2, 270);
  fill(parp);
  text("WHY =)/ !=%=  QUESTIONED...?", width/2, 330);
}

public void slide6032(){
  if(diapositiva == 6033) textFont(teletext, 32);
  fill(255, 0, 255);
  rect(35, 230, 550, 130);
  fill(0, 255, 0);
  text("i can't handle you \n ):< CLOSE ME ):<", width/2, 270);
  fill(parp);
  text("CLOSE$%CLOSE@CLOSE#", width/2, 330);
}



public void slide4224(){
  background(0);if (j>10) j = 10;
  textFont(teletext, 32);
  parpGreen = false;
  parpRed = true;
  background(0);
  fill(parp);
  textAlign(LEFT);
  text(">\n>\n>\n>\n>\n>\n>\n> defining creativity..._ \n> implementing systems that\n>     exhibit creativity..._", 10, j);
}

public void slide4225(){
  textAlign(LEFT);
  textFont(teletext, 32);
  parpGreen = true;
  parpRed = false;
  textFont(teletext, 32);
  if(j > -290) j--;
  text(">\n>\n>\n>\n>\n>\n>\n> improving definition\n>    definition is now:\n>        62% more accurate", 10, j + 295);
  i = -100;
  b = height*2;
}

public void slide4226(){
  background(0);
  textFont(joined, 16);
  textAlign(CENTER, CENTER);
  parpGreen = false;
  parpMagenta = true;
  fill(parp);
  image(smiley, width/4, 150);
  if(parpadear) image(smiley2, width/4, 150);
  text("THANK STHANKS             THANKSTHANKS\n     THANKS    THANKS           THANKS   THANKS\n       THANKS THANKS           THANKS THANKS\nTHANKS THANKS           THANKS THANKS\nTHANKS THANKS           THANKS THANKS\nTHANKS THANKS           THANKS THANKS\nTHANKS THANKS           THANKS THANKS    \n     THANKS THANKS           THANKS     THANKS\nTHANKS THANKS           THANKS THANKS\nTHANKS THANKS           THANKS THANKS    THANK STHANKS           THANKSTHANKS\nTHANKS           THANKS           THANKS THANKS\nTHANKS THANKS           THANKS   THANKS    \nTHANKS THANKS            THANKS THANKS\nTHANKS     THANKS           THANKS THANKS\nTHANKS THANKS           THANKS THANKS\nTHANKS THANKS           THANKS THANKS\nTHANKS THANKS           THANKS THANKS\nTHANKS THANKS           THANKS THANKS      \nTHANK STHANKS           THANKSTHANKS\nTHANKS THANKS           THANKS THANKS\nTHANKS THANKS           THANKS THANKS\nTHANKS THANKS           THANKS THANKS\nTHANKS THANKS           THANKS THANKS\nTHANKS THANKS           THANKS THANKS\n    THANKS ", width/2, height/2);
  fill(0, 0, 255);
  rect(70, i-15, 480, 40);
  textFont(teletext, 32);
  fill(0, 255, 0);
  text("Thank you for your input", width/2, i);

  fill(255, 0, 0);
  rect(70, b-15, 480, 40);
  fill(255);
  text("I function as expected", width/2, b);
  if(i < 100) i+=5;
  if(b > 500) b-=5;
}

  /*void slide4227(){
    if (i >= 100) {
      fill(255, 0);
      rect(70, j+285, 480, 120);
      textFont(teletext, 32);
      fill(255, 255, 0);
      text("if (people understand && define\n  creativity in a logical way) {\n    coputational cretivity = true;\n}", width/2, j+300);
      if( j < 500)j + = 5;
    }

  }*/
  public void settings() {  size(620, 620); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "essay" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
