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
color parp;
int diapositiva;
int rand = 0;

void setup(){
  size(620, 620);
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

void draw(){
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



void mouseClicked(){
  if(mouseButton == LEFT) diapositiva++;
  else if(mouseButton == RIGHT) diapositiva--;

}

void keyPressed(){
  if(key == 'y') diapositiva+=200;
  if(key == 'n') {
    diapositiva+=2000;
    no++;
    println(no);
    println(diapositiva);
  }
}
