package Concetti.overriding;

class Bank{
    int getRateOfInterest(){
        return 0;
    }
}

class SBI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}

class ICICI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}

class AXIS extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}

class Test2{
    public static void main(String[] args){
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI interessi: " + s.getRateOfInterest());
        System.out.println("ICICI interessi: " + i.getRateOfInterest());
        System.out.println("AXIS interessi: " + a.getRateOfInterest());
    }
}