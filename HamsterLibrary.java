void main() {
  System.out.println(zaehleKoernerImMaul());
  run(5);
}



//////// Commands ////////
///Turns///
//rechtsUm();
//umdrehen();

///Movement///
//back();
//left();
//right();
//klettereStufe();
//run(int);

///Counting///
//x = zaehleKoernerImMaul();
//x = checkFieldCount();
//x = vornKorn();

///Checking fields///
//x = rechtsFrei();
//x = linksFrei();
//x = hintenFrei();
//////// Commands ////////


///////
//turns
///////
void rechtsUm(){
	for(int i = 0; i < 3; i++){
		linksUm();
	}
}

void umdrehen(){
	linksUm();
	linksUm();
}


//////////
//movement
//////////
void back(){
	umdrehen();
	vor();
	umdrehen();
}

void left(){
	linksUm();
	vor();
	rechtsUm();
}

void right(){
	rechtsUm();
	vor();
	linksUm();
}

void klettereStufe(int i){
	for(int x = 0; x < i; x++){
		linksUm();
		vor();
		rechtsUm();
		vor();
	}
}

void run(int i){
	for(int x = 0; x < i; x++){
		if(vornFrei()){
			vor();
		}else{
			break;
		}
	}
}


///////////////
//check counts
///////////////
int zaehleKoernerImMaul(){
	int c = 0;
	while(!maulLeer()){
		c++;
		gib();
	}
	for(int i = 0; i < c; i++){
		nimm();
	}
	return c;
}

int checkFieldCount(){
	int c = 0;
	if(kornDa()){
		while(kornDa()){
			nimm();
			c++;
		}
		for(int i = 0; i < c; i++){
			gib();
		}
		return c;
		
	}else{
		return 0;
	}
}

boolean vornKorn(){
	boolean x;
	vor();
	x = kornDa();
	back();
	umdrehen();
	return x;
}


/////////////////////////////
//check if box is available
/////////////////////////////
boolean linksFrei(){
	boolean x;
	linksUm();
	x = vornFrei();
	rechtsUm();
	return x;
}

boolean rechtsFrei(){
	boolean x;
	rechtsUm();
	x = vornFrei();
	linksUm();
	return x;
}

boolean hintenFrei(){
	umdrehen();
	boolean x; 
	x = vornFrei();
	umdrehen();
	return x;
}
//end of file
