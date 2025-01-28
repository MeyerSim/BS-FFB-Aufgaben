//empty brain

public class Roboter 
{
    //Atributes
    private double pos_x;
    private double pos_y;

    private String rob_name;

    //Constructor
    //constructor with default position
    public Roboter(){
        this.pos_x = 0;
        this.pos_y = 0;
    }

    //constructor with custom position
    public Roboter(double start_pos_x, double start_pos_y){
        if(start_pos_x<0||start_pos_y<0){
            System.out.println("Invalid Input!\nX and Y position for roboter must be a positive number");
        }else{
            this.pos_x = start_pos_x;
            this.pos_y = start_pos_y;
        }
    }

    //constructor with custon position and name
    public Roboter(double start_pos_x, double start_pos_y, String new_rob_name){
        if(start_pos_x<0||start_pos_y<0){
            System.out.println("Invalid Input!\nX and Y position for roboter must be a positive number");
        }else{
            this.pos_x = start_pos_x;
            this.pos_y = start_pos_y;
        }
        this.rob_name = new_rob_name;
    }

    //create copy of diffrent robot
    public Roboter(Roboter og_rob){
        this.rob_name = og_rob.getName();
        this.pos_x = og_rob.getX();
        this.pos_y = og_rob.getY();
    }

    //Getter
    //get x position
    public double getX(){
        return this.pos_x;
    }

    //get y position
    public double getY(){
        return this.pos_y;
    }

    //get roboter name
    public String getName(){
        return this.rob_name;
    }

    //Setter
    //set x postion
    public void setX(double new_x){
        if(new_x<0){
            System.out.println("Invalid input!\nNew X position hast to be greater or equal to 0");
        }else{
            this.pos_x = new_x;
        }
    }

    //set y position
    public void setY(double new_y){
        if(new_y<0){
            System.out.println("Invalid input!\nNew Y position hast to be greater or equal to 0");
            //throw new Exception("Invaild", OutOfRange);
        }else{
            this.pos_y = new_y;
        }
    }

    //set roboter name
    public void setName(String new_name){
        this.rob_name = new_name;
    }

    //common methods
    //go left by 1
    public void goLeft(){
        goLeft(1);
    }

    //go left by custom distance
    public void goLeft(int dist){
        if((this.pos_x-dist)<0){
            System.out.println("Roboter can't move "+dist+" steps to the left!");
        }else{
            this.pos_x -= dist;
        }
    }

    //go right by 1
    public void goRight(){
        goRight(1);
    }

    //go right by custom distance
    public void goRight(int dist){
        if((this.pos_x+dist)>32){
            System.out.println("Roboter can't move "+dist+" steps to the right!");
        }else{
            this.pos_x += dist;
        }
    }

    //go up by 1
    public void goUp(){
        goUp(1);
    }

    //go up by custom distance
    public void goUp(int dist){
        if((this.pos_y-dist)<0){
            System.out.println("Roboter can't move "+dist+" steps up!");
        }else{
            this.pos_y -= dist;
        }
    }

    //go down by 1
    public void goDown(){
        goDown(1);
    }

    //go down by custom distance
    public void goDown(int dist){
        if((this.pos_y+dist)>31){
            System.out.println("Roboter can't move "+dist+" steps down!");
        }else{
            this.pos_y += dist;
        }
    }

    //Wether a roboter is more to the right than a diffrent roboter
    public boolean standsRightOf(Roboter comp_rob){
        return this.pos_x>comp_rob.getX();
    }

    //wether a roboter is more to the left side than a diffrent roboter
    public boolean standsLeftOf(Roboter comp_rob){
        return this.pos_x<comp_rob.getX();
    }

    //wether a roboter is above a diffrent robter
    public boolean standsAbove(Roboter comp_rob){
        return this.pos_y<comp_rob.getY();
    }

    //wether a roboter is below a diffrent roboter
    public boolean standsBelow(Roboter comp_rob){
        return this.pos_y>comp_rob.getY();
    }

    //distance from origin
    public double distFromOrigin(){
        return Math.sqrt(Math.pow(this.pos_x,2)+Math.pow(this.pos_y, 2));
    }

    //distance from diffrent roboter
    public double distFrom(Roboter comp_rob){
        double dist_x = 0;
        double dist_y = 0;

        //distance X
        if(standsLeftOf(comp_rob)){
            dist_x = comp_rob.getX()-this.pos_x;
        }else{
            dist_x = this.pos_x-comp_rob.getX();
        }
        //distance Y
        if(standsAbove(comp_rob)){
            dist_y = comp_rob.getY()-this.pos_y;
        }else{
            dist_y = this.pos_y-comp_rob.getY();
        }

        return (Math.sqrt(Math.pow(dist_x, 2)+Math.pow(dist_y, 2)));
    }

    //meet roboter
    public boolean meetRoboter(Roboter r2){
        if((this.pos_x==r2.getX())&&(this.pos_y==r2.getY())){
            return true;
        }
        return false;
    }

    //equals
    public boolean equals(Roboter comp_rob){
        if(this.pos_x==comp_rob.getX()&&this.pos_y==comp_rob.getY()/*&&this.rob_name.equals(comp_rob.getName())*/)return true;
        return false;
    }
}
