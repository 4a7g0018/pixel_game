package game.keyboard;

public class SetState {
    private String state="create";

    public void setNull(){
        this.state=null;
    }

    public void top(){
        this.state="top";
    }

    public void left(){
        this.state="left";
    }

    public void right(){
        this.state="right";
    }

    public void down(){
        this.state="down";
    }

    public void attack(){
        this.state="attack";
    }

    public String getState(){
        return this.state;
    }

}
