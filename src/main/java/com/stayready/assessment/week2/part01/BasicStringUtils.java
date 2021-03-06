package com.stayready.assessment.week2.part01;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) 
    {
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append(string1);
       stringBuilder.append(string2);
       return stringBuilder.toString();
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) 
    {
        StringBuilder stringBuilder = new StringBuilder(string1);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) 
    {
        StringBuilder stringBuilder = new StringBuilder(string1);
        stringBuilder.append(string1).reverse();
        stringBuilder.append(string2).reverse();
        return stringBuilder.toString();
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) 
    {
        
        for (int i = 0; i < string.length();i++)
        {
            for (int j = 0; j < charactersToRemove.length();j++)
            {
                if (!(string.substring(i, i+1).contains(charactersToRemove.substring(j,j+1))))
                {
                 string = string.replace(charactersToRemove.substring(j,j+1), "");
                } 
            }
           
        }
        return string;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) 
    {
        StringBuffer stringBuffer = new StringBuffer(removeCharacters(string, charactersToRemove));

        stringBuffer.reverse();

        return stringBuffer.toString();
        
    }
}
