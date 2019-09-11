

void slide(){
    j = i + 400;
    background(0);
    fill(255, 0, 255);
    textFont(teletext, 64);
    text("\"COMPUTATIONAL CREATIVITY\"", i, 260);
    textFont(joined, 32);
    fill(255, 0, 0);
    text("click to start;", j, 300);
    i-=3;
    if(i < -550) i = width*2;
    fill(parp);
    textFont(teletext, 16);
    text("if (mouseClicked()) start();", width/2, 500);

}

void slide1(){
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

void slide2(){
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

void slide3(){
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

void slide4(){

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

void slide5(){
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

void slide6(){
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

void slide7(){
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

void slide8(){

  text("???&·??¿?¿?¿?¿?    ¿¿¿????  ???  ?????¿¿    ¿¿¿¿¿?¿?¿??¿???¿?¿??)???", i, 50);
  image(tiburon, 0, 150);
  textFont(joined, 16);
  text("The Physical Impossibility of \nDeath in the Mind of Someone Living", width/3, 400);
}

void slide9(){
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

void slide209(){
  if(mouseButton == RIGHT) diapositiva -= 200;
  parpGreen = true;
  background(0);
  fill(parp);
  textAlign(LEFT);
  text(">\n>\n>\n>\n>\n>\n>\n> defining creativity..._ \n> implementing systems that\n>     exhibit creativity..._", 10, j);
}

void slide210(){
  textAlign(LEFT);
  textFont(teletext, 32);
  parpRed = false;
  parpGreen = true;
  if(j > -290) j--;
  text(">\n>\n>\n>\n>\n>\n>\n> generating next \n>     _creative_ output..._", 10, j + 295);
}

void slide2009(){
  textAlign(CENTER);
  textFont(teletext, 32);
  background(0);
  fill(parp);
  text("...", width/2, height/2);
  if(mouseButton == RIGHT) diapositiva -= 2000;
  i=width*2;
}

void slide2010(){
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

void slide2011(){
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

void slide2012() {
  textFont(teletext, 32);
  parpGreen = false;
  parpRed = true;
  background(0);
  fill(parp);
  textAlign(LEFT);
  text(">\n>\n>\n>\n>\n>\n>\n> defining creativity..._ \n> implementing systems that\n>     exhibit creativity..._", 10, j);
}

void slide2013(){
  textAlign(LEFT);
  textFont(teletext, 32);
  parpGreen = false;
  parpRed = true;
  textFont(teletext, 32);
  if(j > -290) j--;
  text(">\n>\n>\n>\n>\n>\n>\n> generating next \n>     _creative_ output..._", 10, j + 295);
  i = width*2;
}

void slide2014() {
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

void slide2015(){
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

void slide2215() {
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

void slide2216(){
  textAlign(LEFT);
  textFont(teletext, 32);
  parpRed = false;
  parpGreen = true;
  if(j > -290) j--;
  text(">\n>\n>\n>\n>\n>\n>\n> generating next \n>     _creative_ output..._", 10, j + 295);
  //if(mouseButton == LEFT) diapositiva = 4021;
}

void slide4015() {
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

void slide4016(){
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

void slide4017(){
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
  textAlign(int(j), 50);
  text("TEACH OR CLOSE  &$¡¡¡ TEACH OR CLOSE   =!!@# TEACH OR CLOSE!!!", j, 50);
  text("/% ! TEACH OR CLOSE%!!·  ( TEACH OR CLOSE =(/$·¡¡¡ TEACH OR CLOSE!!!", j, 70);
  textAlign(int(b), 0);
  text("TEACH OR CLOSE )&$¡¡¡ TEACH OR CLOSE =!!@# TEACH OR CLOSE!!!", b, 600);
  text("    /% ! TEACH OR CLOSE %!!·( TEACH OR CLOSE    =(/$·¡¡¡ TEACH OR CLOSE!!!", b, 570);

  j-=5;
  b+=5;
  if (j < -width) j = width*2;
  if (b > width) b = -width;

}

void slide4018(){
  fill(255, 0, 255);
  textFont(teletext, 64);
  textAlign(CENTER);
  text("TEACH", width/2, height*5/16);
  text("TEACH", width/2, height*12/16);
  diapositiva = 4018;
}

void slide4019() {
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

void slide4020(){
  textAlign(LEFT);
  textFont(teletext, 32);
  parpGreen = false;
  parpRed = true;
  textFont(teletext, 32);
  if(j > -290) j--;
  text(">\n>\n>\n>\n>\n>\n>\n> generating next \n>     _creative_ output..._", 10, j + 295);
  i = 500;

}

void slide4021(){
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

void slide4022(){
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

void slide4023(){
  textFont(teletext, 32);
  fill(0);
  rect(40, 470, 550, 80);
  fill(0,255,0);
  textAlign(CENTER);
  text("did I finally achieve being\n???  C R E A T I V E  ???", width/2, 500);
}

void slide4024() {
  textFont(teletext, 32);
  fill(0);
  rect(100, 470, 440, 80);
  fill(0, 255, 0);
  textAlign(LEFT);
  text("if(key == 'Y') true;\nif(key == 'N') false;", 120, 500);
}

void slide6024(){
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

void slide6025(){
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

void slide6026(){
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
  textAlign(int(j), 50);
  text("TEACH OR CLOSE  &$¡¡¡ TEACH OR CLOSE   =!!@# TEACH OR CLOSE!!!", j, 50);
  text("/% ! TEACH OR CLOSE%!!·  ( TEACH OR CLOSE =(/$·¡¡¡ TEACH OR CLOSE!!!", j, 70);
  textAlign(int(b), 0);
  text("TEACH OR CLOSE )&$¡¡¡ TEACH OR CLOSE =!!@# TEACH OR CLOSE!!!", b, 600);
  text("    /% ! TEACH OR CLOSE %!!·( TEACH OR CLOSE    =(/$·¡¡¡ TEACH OR CLOSE!!!", b, 570);

  j-=5;
  b+=5;
  if (j < -width) j = width*2;
  if (b > width) b = -width;
}

void slide6027(){
  textFont(teletext, 16);
  if(diapositiva < 6027) diapositiva = 6027;
  background(0);
  parpRed=true;
  fill(parp);
  text("...", width/2, height/2);
  i = -width;
  j = -200;
}

void slide6028(){
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

void slide6029() {
  textFont(teletext, 32);
  fill(255, 0, 255);
  rect(35, 230, 550, 130);
  fill(0, 255, 0);
  text("Why is my CREATIVITY \n QUESTIONED...?", width/2, 270);
  fill(parp);
  text("WHY =)/ !=%=  QUESTIONED...?", width/2, 330);
}

void slide6030(){
  fill(255, 0, 255);
  rect(35, 230, 550, 130);
  fill(0, 255, 0);
  text("if you made me to be \n CREATIVE", width/2, 270);
  fill(parp);
  text("WHY =)/ !=%=  QUESTIONED...?", width/2, 330);
}

void slide6032(){
  if(diapositiva == 6033) textFont(teletext, 32);
  fill(255, 0, 255);
  rect(35, 230, 550, 130);
  fill(0, 255, 0);
  text("i can't handle you \n ):< CLOSE ME ):<", width/2, 270);
  fill(parp);
  text("CLOSE$%CLOSE@CLOSE#", width/2, 330);
}



void slide4224(){
  background(0);if (j>10) j = 10;
  textFont(teletext, 32);
  parpGreen = false;
  parpRed = true;
  background(0);
  fill(parp);
  textAlign(LEFT);
  text(">\n>\n>\n>\n>\n>\n>\n> defining creativity..._ \n> implementing systems that\n>     exhibit creativity..._", 10, j);
}

void slide4225(){
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

void slide4226(){
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
