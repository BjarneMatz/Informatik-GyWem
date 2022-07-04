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
	//turn right
	for(int i = 0; i < 3; i++){
		linksUm();
	}
}

void umdrehen(){
	//turn around
	linksUm();
	linksUm();
}


//////////
//movement
//////////
void back(){
	//moves hamster one field to the back
	umdrehen();
	vor();
	umdrehen();
}

void left(){
	//moves hamster one field to the left
	linksUm();
	vor();
	rechtsUm();
}

void right(){
	//moves hamster one field to the right
	rechtsUm();
	vor();
	linksUm();
}

void klettereStufe(int i){
	//moves hamster 1 field right and up
	for(int x = 0; x < i; x++){
		linksUm();
		vor();
		rechtsUm();
		vor();
	}
}

void run(int i){
	//let the hamster move forward for the value given
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
	//returns how many corns are in hamster's mouth
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
	//returns how many corns are on a field
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
	//returns if a corn is infront of the hamster
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
	//checks if left is an available field
	boolean x;
	linksUm();
	x = vornFrei();
	rechtsUm();
	return x;
}

boolean rechtsFrei(){
	//checks if right is an available field
	boolean x;
	rechtsUm();
	x = vornFrei();
	linksUm();
	return x;
}

boolean hintenFrei(){
	//checks if the back is an available field
	umdrehen();
	boolean x; 
	x = vornFrei();
	umdrehen();
	return x;
}
//end of file
