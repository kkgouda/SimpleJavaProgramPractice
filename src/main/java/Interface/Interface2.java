package Interface;

interface Interface2 {
    float rateOfInterest();
}
class SBI implements Interface2{
    public float rateOfInterest(){
        return 9.15f;
    }
}
class PNB implements Interface2{
    public float rateOfInterest(){
        return 10.10f;
    }
}
class TestInterface2{
    public static void main(String[] args) {
       Interface2 bank = new SBI();
       Interface2 bank1 = new PNB();
        System.out.println("ROI:" + bank.rateOfInterest());
        System.out.println("ROI:" + bank1.rateOfInterest());
    }
}
