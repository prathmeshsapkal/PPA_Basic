class InterfaceDemo

interface RBI 
{
    int TaxRate = 30;
    public float CalculateInterest();
}
class SBI implements RBI
{
    public float CalculateInterest()
    {
        return 7.5f;
    }
}    
class BOM implements RBI
{
    public float CalculateInterest()
    {
        return 8.2f;
    }
} 
class InterfaceDemo
{
    public static void main(String A[])
    {
        System.out.println()
    }
}