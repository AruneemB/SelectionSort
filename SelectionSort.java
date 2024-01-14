public class SelectionSort
{
    public static void selectionSort (int [] unsortedArray)
    {
        int passCount = 0; //Variable keeping track of the number of passes

        for(int i = 0; i < unsortedArray.length -1; i++)
        {
            //Segment of code to show the array at the start of the pass
            passCount++;
            System.out.println("Pass " + passCount + " (before swap): ");
            System.out.println("---------------------------------------------------------------------------------");
            for (int element : unsortedArray)
            {
                if(element != unsortedArray[unsortedArray.length -1]) System.out.print(element + ", ");
                else System.out.print(element + ".");
            }
            System.out.println();

            //Segment of code using for loop to swap elements
            int lowestNumberIndex = i;
            for(int j = i + 1; j < unsortedArray.length; j++)
            {
                //If the number at the current index is lower than the number at index i, it is saved as the index of the lowest unsorted number
                if(unsortedArray[j] < unsortedArray[lowestNumberIndex])
                {
                    lowestNumberIndex = j;
                }
            }

            //Number at index i and number at index of the lowest unsorted number are swapped
            int lowestNumber = unsortedArray[lowestNumberIndex];
            unsortedArray[lowestNumberIndex] = unsortedArray[i];
            unsortedArray[i] = lowestNumber;

            //Segment of code to show the array at the end of the pass, showing which elements were swapped
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Pass " + passCount + " (after swapping " + unsortedArray[lowestNumberIndex] + " and " + lowestNumber + "): ");
            System.out.println("---------------------------------------------------------------------------------");
            for (int element : unsortedArray)
            {
                if(element != unsortedArray[unsortedArray.length -1]) System.out.print(element + ", ");
                else System.out.print(element + ". \n");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        //Following is an example test case (can modify the int array to your liking)
        int [] unsortedArray = {4591807, 345, 234, 567, 234, 1, 64, 4092, 34, 657, 86, 1231, 384, 0, -1};
        selectionSort(unsortedArray);
    }
}