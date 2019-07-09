class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        StringBuilder strBuilder = new StringBuilder();
        int lengthOfGroup = 2 * numRows - 2;            
        for (int row = 0; row < numRows; row++)     
        {
            if (row == 0 || row == numRows - 1)      
            {
                for (int j = row; j < s.Length; j += lengthOfGroup)
                {
                    strBuilder.Append(s[j]);
                }
            }
            else                  
            {
                int currentRow = row;           
                bool flag = true;
                int childLenOfGroup1 = 2 * (numRows - 1 - row);                
                int childLenOfGroup2 = lengthOfGroup - childLenOfGroup1;

                while (currentRow < s.Length)
                {
                    strBuilder.Append(s[currentRow]);
                    if (flag)
                        currentRow += childLenOfGroup1;
                    else
                        currentRow += childLenOfGroup2;
                    flag = !flag;
                }
            }
        }
        return strBuilder.ToString();
    }
}
