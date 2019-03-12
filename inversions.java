class inversions {

    static long countSplit(int a[],int left,int right)
    {
        int mid;
        long  num = 0;

        if (right > left)
        {
            mid = (right + left)/2;

            num  = countSplit(a, left, mid);

            num += countSplit(a,  mid+1, right);

            num += count(a, left, mid+1, right);
        }
        return num;
    }

    static long count(int a[],int l,int m,int r)
    {

        int length=r-l+1;

        int c[]=new int[length];

        int i=0,x=l,y=m;

        long num=0;

        while(x <= m-1 && y<=r)
        {
            if(a[x] <= a[y])
            {
                c[i]=a[x];
                i++;x++;
            }
            else
            {
                c[i]=a[y];
                num+= m-x;
                i++;y++;
            }
        }

        while(x <= m-1)
        {
            c[i]=a[x];
            i++;x++;
        }

        while(y<=r)
        {
            c[i]=a[y];
            i++;
            y++;
        }
        i=0;

        while(l<=r)
        {
            a[l]=c[i];
            l++;
            i++;
        }
        return num;

    }


    public static void main(String[] args)
    {
        int a[] = { 9, 12, 3, 1, 6, 8, 2, 5, 14, 13, 11, 7, 10, 4, 0};

        int n = a.length;

        System.out.println("Number of Inversion = "+countSplit(a,0,n-1));;
    }

}