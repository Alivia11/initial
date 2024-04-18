class Main{
  public static void main(String[] args){
  Avatar cassie = new Avatar(" land", "sword");
    cassie.fightGiant();
  }
  public static class Avatar{
    String type, weapon;
    public Avatar(String startType, String startWeapon){
        type = startType;
        weapon = startWeapon;
    }
    public void fightGiant(){
        System.out.println("You fight the Giant in the" + type + ".");
        if(type.equals("air")){
         System.out.println("you fly to victory.");
      }else{
        System.out.println("you swim to victory");
      }
        
      }
    }
  }