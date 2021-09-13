
Input:->
101|Blackpoll|12
102|Liverpoll|10
103|Manchester City|12
104|Lciester City|13
105|Manchester United|11
106|Newcastle City|12

Code:->

sort -nrk3 -t "|" |awk 'BEGIN {FS="|"}
{
    if($2 ~ /^Manchester/)
    {
        print $2;
    }
}'|head -1

Output:->
Manchester City
