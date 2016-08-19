package com.company;

import java.util.Arrays;

/**
 * Created by Александр on 15.08.2016.
 */
public class WorkClass2 extends ServiceClass
{

    public void startSecondHomeWork(String[] args)
    {
        System.out.println("");

        System.out.println("Part 2 ");
        System.out.println("");

        System.out.println("");
        System.out.println("Point 1");
        System.out.println("");
        findMaxMinLenghtValue(args);


        System.out.println("");
        System.out.println("Point 2");
        System.out.println("");

        sortByMaxMinNumberOfChars(args);

        System.out.println("");
        System.out.println("Point 3");
        System.out.println("");

        avarageNumberOfChars(args);

        System.out.println("");
        System.out.println("Point 4");
        System.out.println("");

        findValueWithMinSameChars(args);

        System.out.println("");
        System.out.println("Point 5");
        System.out.println("Не понятно задеание(");

        System.out.println("");
        System.out.println("Point 6");
        System.out.println("");

        findValueIncreasedOneByOne(args);


    }

    private void findMaxMinLenghtValue(String[] args)
    {
        int[] values = getIntFromString(args);
        int[] numOfChars = getMassiveOfCharsFromIntMassive(values);

        bubbleSort(values);
        bubbleSort(numOfChars);

        System.out.println("Find Max Min values from Array");
        System.out.println("max value = " + values[values.length - 1] + " num of chars " + numOfChars[numOfChars.length - 1]);
        System.out.println("min value = " + values[0] + " num of chars " + numOfChars[0]);
//        for (int i = 0; i <values.length ; i++) {
//            System.out.println(values[i]);
//        }
    }
    private void sortByMaxMinNumberOfChars(String[] args)
    {
        int[] values = getIntFromString(args);
        int[] numOfChars = getMassiveOfCharsFromIntMassive(values);

        bubbleSort(values);
        bubbleSort(numOfChars);

        System.out.println("Min -> max");

        for (int i = 0; i < values.length ; i++)
        {
            System.out.println("Value " + values[i] + " - > Number of Chars " + numOfChars[i]);
        }
        System.out.println("");
        System.out.println("Max -> min");

        for (int i = values.length - 1; i > 0 ; i--)
        {
            System.out.println("Value " + values[i] + " - > Number of Chars " + numOfChars[i]);
        }
    }
    private void avarageNumberOfChars(String[] args)
    {
        int[] values = getIntFromString(args);
        int[] numOfChars = getMassiveOfCharsFromIntMassive(values);
        int sumOFNumChars = 0;
        int numOfValues = 0;

        for (int i = 0; i < numOfChars.length; i++) // calculate avarage number of chars
        {
            sumOFNumChars += numOfChars[i];
            numOfValues ++;
        }
        double avarageNumOfChars = (double)sumOFNumChars / (double)numOfValues;
        //System.out.println(avarageNumOfChars);
        System.out.println("Values less then avarage");
        for (int i = 0; i < numOfChars.length; i++)
        {
            if(numOfChars[i] < avarageNumOfChars)
            {
               System.out.println("Value " + values[i] + " - > Number of Chars " + numOfChars[i]);
            }
        }
        System.out.println("Values bigger then avarage");
        for (int i = 0; i < numOfChars.length; i++)
        {
            if(numOfChars[i] > avarageNumOfChars)
            {
                System.out.println("Value " + values[i] + " - > Number of Chars " + numOfChars[i]);
            }
        }


    }
    private void findValueWithMinSameChars(String[] args)
    {
        int[] values = getIntFromString(args);
        int[] countArray = new int[values.length];
        int maxValueOfDifferentDigitsIndex = 0;
        int maxValueOfDifferentDigits = 0;

        for (int i = 0; i < values.length; i++)
        {

            int count = 0;
            int[] valueElements = getCharsOfInteger(values[i]);
            for (int j = 0; j < valueElements.length; j++)
            {

                for (int k = j + 1; k < valueElements.length ; k++ )
                {
                    if(valueElements[j] == valueElements[k])
                    {
                        count++;
                    }
                }
            }
            countArray[i] = count;
        }

        for (int j = 0; j < countArray.length; j++)// find element with max value
        {

           if(countArray[j] > maxValueOfDifferentDigits)
           {
               maxValueOfDifferentDigitsIndex = j;
               maxValueOfDifferentDigits = countArray[j];
           }
        }
        System.out.println("Value with least Digits Number");

        System.out.println(values[maxValueOfDifferentDigitsIndex]);

    }
    private void findValueIncreasedOneByOne(String[] args)
    {
        int[] values = getIntFromString(args);
        for(int value : values)
        {

        }
    
    }







}
