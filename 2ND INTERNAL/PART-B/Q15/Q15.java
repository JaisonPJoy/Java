class ArraySort<T extends Number>
{
   /*T inputArray[];
    ArraySort(T inputArray[])
    {
        this.inputArray = inputArray;
    }*/
    static <T extends Comparable<T>> void Sort(T inputArray[])
    {
        T temp;
        for(int i = 0; i<inputArray.length; i++)
        {
            for(int j = i+1; j<inputArray.length; j++)
            {
                if(inputArray[i].compareTo(inputArray[j])>0)
                {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
    }
}
class Q15
{
    public static void main(String args[])
    {
        Integer inputArray[] = {3,9,7,5,2,6,4,1};
        ArraySort<Integer> T = new ArraySort<Integer>();
        System.out.println("INPUT ARRAY");
        for(int i = 0; i<inputArray.length; i++)
        {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println("");
        T.Sort(inputArray);
        System.out.println("SORTED ARRAY");
        for(int i = 0; i<inputArray.length; i++)
        {
            System.out.print(inputArray[i] + " ");
        }
    }
}
