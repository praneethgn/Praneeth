enum Apple
{
    janathan,goldendel,reddel,winesap,cortland;
}
class enumdemo
{
    public static void main(String args[])
     {
    Apple ap=Apple.winesap;
    System.out.println("value of ap :"+ap);
    if (ap==Apple.reddel)
    System.out.println("ap containg goldendel\n");
    switch(ap)
    { 
      case janathan:
       System.out.println("janathan delicince is red");
       break;
       case reddel:
       System.out.println(" reddel delicince is red");
       break;
       case winesap:
       System.out.println("winesap delicince is red");
       break;
       case goldendel:
       System.out.println("goldendel delicince is red");
       break;
       case cortland:
       System.out.println("cortland delicince is red");
       break;
    }
  }
}  