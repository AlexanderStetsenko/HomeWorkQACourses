package com.company;

import java.util.Scanner;

/**
 * Created by Александр on 15.08.2016.
 */
public class ServiceClass
{
    Scanner input = new Scanner(System.in);
    // service methods start
    protected int getNumberOfValueFromConsole()
    {
        System.out.println("Enter \"n\": ");
        int numberOfValue = 0;
        numberOfValue = input.nextInt();
        return numberOfValue;
    }

    protected int getCountsOfDigits(int number) // Count number of char in Integer
    {
        int count = (number == 0) ? 1 : 0;
        while (number != 0)
        {
            count++;
            number /= 10;
        }
        return count;
    }

    protected int[] getCharsOfInteger(int number) // Integer is divided into separate elements
    {
        int[] elements = new int[getCountsOfDigits(number)];
        for (int i = 0; i < elements.length ; i++)
        {

            elements[elements.length - i - 1] =  number % 10;
            number /= 10;
        }
//        for (int i = 0; i < elements.length ; i++)
//        {
//
//            System.out.println(elements[i]);
//        }
        return elements;

    }


    protected void bubbleSort(int[] values) // sort form min to max
    {
        int tmp = 0;
        for (int i = values.length; i > 0 ; i--)
        {
            for (int j = 0; j < values.length - 1 ; j++)
            {
                if(values[j] > values[j + 1 ])
                {
                    tmp = values[j +1 ];
                    values[j + 1] = values[j];
                    values[j] = tmp;
                }
            }

        }

    }



    protected  int[] getMassiveOfCharsFromIntMassive(int[] values)// get massive of chars number for values
    {
        int[] numOfChars = new int[values.length];
        int i = 0;
        for (int value : values)
        {
            numOfChars[i] = getCountsOfDigits(value);
            i++;
        }
        return numOfChars;
    }


    protected int[]  getIntFromString(String[] args) {
        int[] values = new int[args.length];
        for (int i = 0; i < args.length; i++)
        {
            values[i]  = Integer.valueOf(args[i]);

        }
        return values;
    }
    // service methods end
}
