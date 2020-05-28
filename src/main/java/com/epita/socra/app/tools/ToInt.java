package com.epita.socra.app.tools;

public class ToInt {
    public int toint(String roman)
    {
        int res = OneRomanToInt(roman.charAt(0));
        int len = roman.length();
        if (len == 2)
        {
            if (OneRomanToInt(roman.charAt(1)) > res)
            {
                res = OneRomanToInt(roman.charAt(1)) - res;
            }
            else
            {
                res += OneRomanToInt(roman.charAt(1));
            }
        }
        else
        {
            int i = 0;
            res = 0;
            while (i < len - 1)
            {
                if (OneRomanToInt(roman.charAt(i)) >= OneRomanToInt(roman.charAt(i + 1)))
                {
                    res += OneRomanToInt(roman.charAt(i));
                    i++;
                }
                else
                {
                    res += OneRomanToInt(roman.charAt(i + 1)) - OneRomanToInt(roman.charAt(i));
                    i+=2;
                }
            }
            if (i == len - 1)
            {
                res += OneRomanToInt(roman.charAt(i));
            }
        }
        return res;
    }

    String tostring(int a)
    {
        return Integer.toString(a);
    }

    int OneRomanToInt(char c)
    {
        int res = 0;
        switch (c)
        {
            case 'I':
                res = 1;
                break;
            case 'V':
                res = 5;
                break;
            case 'X':
                res = 10;
                break;
            case 'L':
                res = 50;
                break;
            case 'C':
                res = 100;
                break;
            case 'D':
                res = 500;
                break;
            case 'M':
                res = 1000;
                break;
            default:
                System.exit(1);
        }
        return res;
    }
}
