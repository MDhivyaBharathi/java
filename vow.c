#include <stdio.h>
int main(){
  char n;
  printf("Enter an alphabet: ");
  scanf("%c",&c);
  if(n=='a'||n=='A'||n=='e'||n=='E'||n=='i'||n=='I'||n=='o'||n=='O'||n=='u'||n=='U')
       printf("%c is a vowel.",n);
  else
       printf("%c is a consonant.",n);
  return 0;
}