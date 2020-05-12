package com.bhavyakaria.cp.codeforces;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;

public class OracAndFactors {

    public static void main(String[] args) {
        try {
            Scans scan = new Scans();
            Prints print = new Prints();

            int t = scan.scanInt();

            while (t-- > 0) {
                int n = scan.scanInt();
                int k = scan.scanInt();

                while (k-- > 0) {
                    int divisor = -1;

                    if (n % 2 == 0) {
                        divisor = 2;
                    } else {
                        for (int i = 3; i <= Math.sqrt(n); i += 2) {
                            if (n % i == 0) {
                                divisor = i;
                                break;
                            }
                        }
                    }

                    if (divisor == -1) {
                        divisor = n;
                    }

                    if (divisor == 2 || divisor == n) {
                        n += divisor + 2*k;
                        break;
                    } else {
                        n += divisor;
                    }
                }
                print.printLine(String.valueOf(n));
            }
            print.close();
        } catch (Exception e) {

        }
    }
}

class Scans {
    private byte[] buf=new byte[1024];
    private int index;
    private InputStream in;
    private int total;
    public Scans()
    {
        in=System.in;
    }
    public int scan()throws IOException
    {
        if(total<0)
            throw new InputMismatchException();
        if(index>=total)
        {
            index=0;
            total=in.read(buf);
            if(total<=0)
                return -1;
        }
        return buf[index++];
    }
    public int scanInt()throws IOException
    {
        int integer=0;
        int n=scan();
        while(isWhiteSpace(n))
            n=scan();
        int neg=1;
        if(n=='-')
        {
            neg=-1;
            n=scan();
        }
        while(!isWhiteSpace(n))
        {
            if(n>='0'&&n<='9')
            {
                integer*=10;
                integer+=n-'0';
                n=scan();
            }
            else throw new InputMismatchException();
        }
        return neg*integer;
    }
    public double scanDouble()throws IOException
    {
        double doub=0;
        int n=scan();
        while(isWhiteSpace(n))
            n=scan();
        int neg=1;
        if(n=='-')
        {
            neg=-1;
            n=scan();
        }
        while(!isWhiteSpace(n)&&n!='.')
        {
            if(n>='0'&&n<='9')
            {
                doub*=10;
                doub+=n-'0';
                n=scan();
            }
            else throw new InputMismatchException();
        }
        if(n=='.')
        {
            n=scan();
            double temp=1;
            while(!isWhiteSpace(n))
            {
                if(n>='0'&&n<='9')
                {
                    temp/=10;
                    doub+=(n-'0')*temp;
                    n=scan();
                }
                else throw new InputMismatchException();
            }
        }
        return doub*neg;
    }
    public String scanString()throws IOException
    {
        StringBuilder sb=new StringBuilder();
        int n=scan();
        while(isWhiteSpace(n))
            n=scan();
        while(!isWhiteSpace(n))
        {
            sb.append((char)n);
            n=scan();
        }
        return sb.toString();
    }
    private boolean isWhiteSpace(int n)
    {
        if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
            return true;
        return false;
    }
}

class Prints {
    private final BufferedWriter bw;
    public Prints()
    {
        bw=new BufferedWriter(new OutputStreamWriter(System.out));
    }
    public void print(String str)throws IOException
    {
        bw.append(str);
    }
    public void printLine(String str)throws IOException
    {
        print(str);
        bw.append("\n");
    }
    public void close()throws IOException
    {
        bw.close();
    }
}
