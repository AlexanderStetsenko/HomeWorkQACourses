package com.company;

import java.util.*;



/**
 * Created by Александр on 08.08.2016.
 */
public class WorkClass extends ServiceClass
{






    private void  invertConsoleArguments(String[] arguments)
    {
        for (int i = 0; i <arguments.length ; i++)
        {
            String[] invertArguments = new String[arguments.length];
            invertArguments[i] = arguments[arguments.length - 1 - i];
            System.out.print(invertArguments[i] + " ");
        }
    }
    public void nameDisplaying ()
    {
        System.out.println("Please enter name");
        String name = input.nextLine();
        System.out.println("Hello my dear, " + name);
    }
    private int[] generateRandomValues()// generate random Int array and return it
    {
        System.out.println("Please enter amount of numbers ");
        int number = input.nextInt();
        int[] randomValues = new int[number];
        for (int i = 0; i < number; i++)
        {
            randomValues[i] = random.nextInt();
        }
        return randomValues;
    }
    private void predeterminedAmountWithNewLine ()// outprint massive element with defferent lines
    {
        int[] randomValues = generateRandomValues();
        for (int i = 0; i <= randomValues.length - 1 ; i++)
        {
            System.out.println(randomValues[i]);
        }

    }
    private void predeterminedAmountWithoutNewLine ()//outprint massive element on one lines
    {
        int[] randomValues = generateRandomValues();
        for (int i = 0; i <= randomValues.length - 1 ; i++)
        {
            System.out.print(randomValues[i] + " ");
        }
//        System.out.println("Point 3");
//
//        System.out.println("Please enter amount of numbers ");
//        int number = input.nextInt();
//        for (int i = 0; i <= number; i++)
//        {
//            int luckyNum = random.nextInt();
//            System.out.print(luckyNum);
//        }

    }

    private String passwordEntering()// take value from console and return it
    {
        System.out.println("Please enter password");
        String pass;
        pass = input.nextLine();
        return pass;
    }

    private void comparePassWithTemplate(String password)
    {
        if ( password.equals("template"))
        {
            System.out.println("valid password");
        }
        else
            {
                System.out.println("invalid password");
            }
    }

    private void sumOFNumdersFromArgs(String[] arguments)// Takes arguments from console and calculate sum
    {
        int sum = 0;
        for (int i = 0; i < arguments.length; i++)
        {
            int converterInt =  Integer.valueOf(arguments[i]);
            sum += converterInt;
        }
        System.out.println("Sum of arguments: " + sum);
    }

    private int[] getIntValueFromConsole() // get n number of values from console(n  - we get from getNumberOfValueFromConsole() )
    {

        int[] valueList = new int[getNumberOfValueFromConsole()];
        for (int i = 0; i < valueList.length ; i++)
        {
            System.out.println("Enter "+ (i + 1) +" value from " + valueList.length);
            valueList[i] = input.nextInt();
            //System.out.println(valueList[i]);
        }
        return valueList;
    }


    private void getEvenValue(int[] workArray)
    {
        System.out.print("Even numbers: ");
        for (int i = 0; i < workArray.length; i++)
        {
            if(workArray[i]%2 == 0)
            {
                System.out.print(workArray[i] + "; ");
            }
        }
        System.out.println("");

    }

    private void getOddValue(int[] workArray)
    {
        System.out.print("Odd numbers: ");
        for (int i = 0; i < workArray.length; i++)
        {
            if(workArray[i]%2 != 0)
            {
                System.out.print(workArray[i] + "; ");
            }
        }
    }

    private void getMaxValue(int[] workArray)
    {
        int indexOfMaxValue = 0;
        for (int i = 0; i < workArray.length; i++) {
            if (workArray[indexOfMaxValue] < workArray[i]) {
                indexOfMaxValue = i;
            }
        }
        System.out.print("\nMax value is: " + workArray[indexOfMaxValue] + ";");
    }

    private void getMinValue(int[] workArray)
    {
        int indexOfMinValue = 0;
        for (int i = 0; i < workArray.length; i++) {
            if (workArray[indexOfMinValue] > workArray[i]) {
                indexOfMinValue = i;
            }
        }
        System.out.print("\nMin value is: " + workArray[indexOfMinValue] + ";");
    }

    private void getValuesDivideNineThree(int[] workArray)
    {
        System.out.print("\nValue can be divided by 3 or 9: ");
        for (int value : workArray)
        {
            if( value % 3 == 0 || value % 9 == 0)
            {
                System.out.print(value + "; ");
            }
        }
    }

    private void getValuesDivideFiveSeven(int[] workArray)
    {
        System.out.print("\nValue can be divided by 5 or 7: ");

        for (int value : workArray)
        {
            if( value % 5 == 0 || value % 7 == 0)
            {
                System.out.print( value + "; ");
            }
        }
    }

    private void getThreeNumbersDigits(int[] workArray)
    {
        System.out.print("\nThree Numbers Digits: ");

        for( int value : workArray)
        {
            if(getCountsOfDigits(value) == 3)
            {
                System.out.print(value + "; ");
            }
        }
    }

    private void getHappyValue(int[] workArray)
    {
        ArrayList<Integer> valuesList = new ArrayList<Integer>() ;


        for (int value : workArray)
        {
            if ( getCountsOfDigits(value)%2 == 0)
            {
                valuesList.add(value);
            }
        }
        System.out.print("\nHappy digit: ");

        for (int value : valuesList)
        {
            int sumStart = 0;
            int summEnd = 0;

            int[] arrayChars = getCharsOfInteger(value);
            for (int i = 0; i < arrayChars.length / 2 ; i++)
            {

                sumStart += arrayChars[i];
                summEnd +=arrayChars[arrayChars.length - i - 1];
            }
            if (sumStart == summEnd)
            {
                System.out.print(value + "; " );
            }

        }
    }

    private void getHalfValue(int[] workArray)
    {

    }


    public void startFirstHaomeWork(String[] args)
    {
        System.out.println("Point 1");
        nameDisplaying();
        System.out.println("Point 2");
        invertConsoleArguments(args);
        System.out.println("");
        System.out.println("Point 3");
        predeterminedAmountWithNewLine();
        predeterminedAmountWithoutNewLine();
        System.out.println("");
        System.out.println("Point 4");
        String pass = passwordEntering();
        comparePassWithTemplate(pass);
        System.out.println("Point 5");
        sumOFNumdersFromArgs(args);
        System.out.println("Point 6");
        int[] workArray = getIntValueFromConsole();
        getEvenValue(workArray);
        getOddValue(workArray);
        getMaxValue(workArray);
        getMinValue(workArray);
        getValuesDivideNineThree(workArray);
        getValuesDivideFiveSeven(workArray);
        getThreeNumbersDigits(workArray);
        getHappyValue(workArray);
    }
}
