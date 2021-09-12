awk 'BEGIN {FS="|"}
{
    a[$3]++;
}
END {for (i in a)
     print(i,a[i])}'|sort -t " "
     
