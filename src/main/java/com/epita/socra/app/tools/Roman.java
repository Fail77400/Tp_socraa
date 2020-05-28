package com.epita.socra.app.tools;

public class Roman {
    public String toRoman(int decimal)
    {
        StringBuilder res = new StringBuilder();

        while (decimal != 0)
        {
            if (decimal >= 1000)
            {
                for (int j = 0; j < decimal / 1000; j++) {
                    res.append('M');

                }
                decimal = decimal % 1000;
            }
            else if (decimal >= 500)
            {
                if (decimal < 900)
                {
                    for (int j = 0; j < decimal / 500; j++) {
                        res.append('D');
                    }
                    decimal = decimal % 500;
                }
                else
                {
                    res.append('C');
                    res.append('M');
                    decimal = decimal % 100;
                }
            }
            else if (decimal >= 100)
            {
                if (decimal < 400)
                {
                    for (int j = 0; j < decimal/100; j++)
                    {
                        res.append('C');
                    }
                    decimal = decimal % 100;
                }
                else
                {
                    res.append('C');
                    res.append('D');
                    decimal = decimal % 100;
                }
            }
            else if (decimal >= 50)
            {
                if (decimal < 90)
                {
                    for (int j = 0; j < decimal / 50; j++) {
                        res.append('L');
                    }
                    decimal = decimal % 50;
                }
                else
                {
                    res.append('X');
                    res.append('C');
                    decimal = decimal % 10;
                }
            }
            else if (decimal >= 10)
            {
                if (decimal < 40)
                {
                    for (int j = 0; j < decimal / 10; j++) {
                        res.append('X');
                    }
                    decimal = decimal % 10;
                }
                else
                {
                    res.append('X');
                    res.append('L');
                    decimal = decimal % 10;
                }
            }
            else if (decimal >= 5)
            {
                if (decimal < 9)
                {
                    for (int j = 0; j < decimal / 5; j++) {
                        res.append('V');
                    }
                    decimal = decimal % 5;
                }
                else
                {
                    res.append('I');
                    res.append('X');
                    decimal = 0;
                }
            }
            else if (decimal >= 1)
            {
                if (decimal < 4)
                {
                    for (int j = 0; j < decimal; j++) {
                        res.append('I');
                    }
                    decimal = 0;
                }
                else
                {
                    res.append('I');
                    res.append('V');
                    decimal = 0;
                }
            }
        }
        String result = new String(res);
        return result;
    }
}
