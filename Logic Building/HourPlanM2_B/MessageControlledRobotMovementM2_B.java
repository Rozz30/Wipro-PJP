package HourPlanM2_B;

public class MessageControlledRobotMovementM2_B {
	public String moveRobot(int input1,int input2,String input3,String input4) {
		int bottomL=0;
		int bottomR=0;
		int topL=input2;
		int topR=input1;
		String[] directions={"N","E","S","W"};
		String[] curPos=input3.trim().split("-");
		for(String pos:curPos)
			System.out.print(pos);
		int currentX=Integer.parseInt(curPos[0]);
		int currentY=Integer.parseInt(curPos[1]);
		int currentDpos=0;
		for(int i=0;i<directions.length;i++){
			if(directions[i].equals(curPos[2])){
				currentDpos=i;
				break;
			}
		}
		String[] inst=input4.trim().split(" ");
		int flag=1;
		for(int i=0;i<inst.length;i++){
			if(inst[i].equals("M")){
				if(currentDpos==0){
					if(currentY+1>topL){
						flag=0;
						break;
					}
					++currentY;
				}else if(currentDpos==1){
					if(currentX+1>topR){
						flag=0;
						break;
					}
					++currentX;
				}else if(currentDpos==2){
					if(currentY-1<bottomR){
						flag=0;
						break;
					}
					--currentY;
				}else if(currentDpos==3){
					if(currentX-1<bottomL){
						flag=0;
						break;
					}
					--currentX;
				}
			}else if(inst[i].equals("R")){
				currentDpos=(currentDpos+1)%4;
			}else if(inst[i].equals("L")){
				currentDpos=(currentDpos-1);
				if(currentDpos<0){
					currentDpos=4-currentDpos;
				}
			}
		}

		StringBuilder answer=new StringBuilder();
		if(flag==0){
			answer.append(currentX+"-"+currentY+"-"+directions[currentDpos]+"-ER");
			return answer.toString();
		}
		answer.append(currentX+"-"+currentY+"-"+directions[currentDpos]);
		return answer.toString();
	}
}
