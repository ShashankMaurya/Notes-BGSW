%[flag][width][.precision][mod][conversion char]
in flag we can have 0, +, -
in width we can have any number or *. * is called mast per width
for example; z=printf("%*c%*c",x, ' ',y, ' '); value of x and y will go to stars(*) and that much spaces will be printed and total will be returned to z. this is called bit masking.
in precision, any decimal number
:: this operator has highest priority in C++
()[]{}.-> this operator has highest priority in C
which operators cannot be overloaded?
ans: ::,ternery, ., *, sizeof()
which operator cannot be overloaded using friend  function?
ans: ::, fucntion call op
macro= first replace then evaluate and not compiled before replacement, i.e., first replace then compile
for pointer, a new memory location is allocated but not for reference variable
uninitialised pointers are known as wild pointers
pointers can be null but not reference variables
use bitwise operator instead of arithematic to make code efficient because it directly works in binary
stringzie operator is # = converts anything to double quoted string
tokenpasting operator is ## = concatenates the right token with left token

examples:
	#define display(x) #x
	
	int display(int p)
	{
		...
	}
so, display(int p) will turn to "int p" before going to the compiler

	#define display m##a##i##n
	void display()
	{
		printf("hello");
	}
so, token main will be concatenated due to the ## operator and is replaced with display.
this is the answer to the question: WAP to print hello w/o using the main word

Q: display semicolon w/o using printf() and ; operator
ans:
	if(putchar(59))
	{
	}
putchar() is in if so no ; used in code and 59 is ascii for ;

Q: swap 2 nos. w/o using 3rd variable or any arithematic operator and in only one line
A: a^=b^=a^=b
above statement swaps val. of a and b

breakdown:
	1. a=a^b
	2. b=b^a
	3. a=a^b

best case scenario for var. swap

Q: display 1st n natural nos. w/o loop or any other functions
A: 
int main()
{
	static a = 1;
	if(a>100)
	return 0;
	printf("%d", a++)
	main();
}
static values remain in the memory till the end of the code
static values are not stored in stack memory, it's in data memory, so it has only one copy during recursion

Q: swap cases for a character w/o using any library function or any conditional operator or any arithematic operator
A: ch=ch^32;

Q: greatest among 3 integers
int max=a;
(max<b)&&(max=b);
(max<c)&&(max=c);
return max;

this is known as shortckt and

Q: wap to print it's own source code
A:
	FILE *fp;
	char c;
	fp=fopen(__FILE__,"r")
	do
	{
		c=getc(fp);
		putchar(c);
	}
	while(c!=EOF);
	fclose(fp);

Q: check is no. is in power of 2
A: int isPowerofTwo(int n)
{
	return (n &&!(n & (n-1)));
	/*n will check if n==0 and !(n & (n-1)) will check if n is a power of two or not*/
	
}

Q: wap to copy 1 string to another w/o using library function
A:
	void StringCpy(char *s1, char *s2) //user defined function
	{
		while(*s1++=*s2++); //one line logic 
	}

Q: subtract 2 nos w/o using '-'
A:
	diff=a+~b+1;

Q: Why java is a robust language?
A: memory management mistake (garbage collector in java which handles this)
   mishandle exception (checked exception handling)
   <2 reasons for code failure>
   these 2 are not in java so robust.
   
   2 types of exception:
   	checked and unchecked exception
   	if checked exception is not handled, then code won't will compiled.
   	
Q: Why java is secure?
A: code is checked twice:
	once at compile time(compiler) and 2nd at runtime by (bytecode verifier)

Q: what is RMI?
A: Remote method Invocation 
Distributed application: program in one system can call/invoke the function in another system

Q: application of static keyword in java?
A: static data members or static method or static nested class or static block or static import.

example of static import

import java.lang.Math;

<we always gotta use Math class for calling it's functions>

Math.pow();

import static java.lang.Math;
<we can directly used>

pow();
sin();

Q: diff. b/w final, finally, finalize()?
A: 
final -> a final function/method cannot be overidden. final class cannot be inherited. the value of a final variable cannot be changed.
finally -> try-catch-finally block
finalize -> frees the memory space reserved by non-java resources (like a c function called by non-java program)


java:
	xyz.java --<compile>--> xyz.class -->bytecode
	
c/cpp:
	xyz.c/cpp --<C-preprocessor>--> preprocessed_code.i --<compiler>--> assembly_code.s --<assembler>--> object_code_file.o --<linker/link editor>--> executable_file.exe

struct xyz
{
	char c;
	int a;
};
therefore, sizeof(xyz) = 8 bytes (because structure is created on the basis of largest element)
like if instead of int a its double a, then sizeof(xyz) will be 16 bytes
this phenomena is known as structure padding (concept of C)

like
struct xyz1
{
	char c;
	int a;
	double x;
};

struct xyz1 is created on the basis of double x, so 8 bytes ka 3 memory banks will be reserved. char c and int a can accomodate in 1st 8 byte slot, then 3 bytes of structure padding, then double x will take the whole 2nd slot, and the last slot will  be dissolved.
so, sizeof(struct xyz) will be 16 bytes. (last 8 bytes will be dissolved)

BUT

struct xyz2
{
	char c;
	double x;
	int a;
};

sizeof(xyz2) will be 24 bytes. 
Explaination: 8 bytes ka 3 slots create hoga. char c will be assigned to 1st slot. double x can't be accomodated to the rest of the area so the rest of the 7 bytes will be structure padding. double x will be assigned to the 2nd slot. then finally, double x has accomadated the full 2nd slot. so 3rd slot will be assigned int a.
so, 8x3 24 bytes


struct xyz1
{
	int age:8;
	int roll:8; //8 bits
};
here sizeof(xyz1) = 8 bytes (8+8 bits)
these are known as bit fields. these are memory saving aspects of structures
disadvantages of bit fields are that there's no pointer to structure for this, i.e. you can't accept data to this using scanf(). you can only assign data to this.



LINKED LIST:

#include<malloc.h>
typedef struct Node //typedef basically defines the type struct Node so that we need not write struct Node each time. khaali Node likhne se kaam ho jaayega.
{
	int info;
	struct node *next;
}NODE;
void traverse(NODE *s)
{
	if(s==NULL)
	printf("list is empty");
	else
	{
		while(s!=NULL)
		{
			printf("%d->", s->info);
			s=s->next;
		}
	}
}
void findMiddle(NODE *s)
{
	NODE *p, *q;
	p=q=s;
	while(q->next!=NULL)
	{
		p=q->next;
		q=q->next->next;
		if(q==NULL)
		{
			printf("Enter odd no. of element.");
			return;
		}
	}
	printf("\n%d", p->info);
}
void findnthfromend(NODE *s, int n)
{
	int len=0,i;
	NODE *node=s;
	while(node!=NULL)
	{
		len++;
		node=node->next;
	}
	for(i=1;i<=len-n;i++)
	s=s->next;
	printf("\n%d", s->info);
}
void createList(NODE **ps) //double pointer because we are passing reference to the struct in the actual parameters
{
	char ch;
	NODE *node;
	do{
		if(*ps==NULL)
		{
			*ps=(NODE*)malloc(sizeof(NODE));
			printf("enter value for new node: ");
			scanf("%d", &(*ps)->info);
			*ps->next=NULL;
			node=*ps;
		}
		else
		{
			node->next=(NODE*)malloc(sizeof(NODE));
			node=node->next;
			printf("enter value for new node: ");
			scanf("%d", &node->info);
			node->next=NULL;
		}
		printf("do you want to create more nodes (Y/N): ");
		scanf(" %c", &ch); //everytime we use scanf(), the <enter> we hit after entering out input data is stored in out input buffer (stdin), so if we directly put scanf() in the middle of the code it'll take the <enter> as it's input from the buffer. so we put a <space> before %c, as in " %c" to deal with that.
	}while(ch=='Y' || ch=='y');
}
int main()
{
	int choice,n;
	NODE *start = NULL; //head node
	do
	{
		printf("\n1. create list: ");
		printf("\n2. traverse: ");
		printf("\n3. Find middle: ")
		printf("\n4. nth from end: ")
		printf("\n5. Exit: ");
		printf("\nenter your choice: ");
		scanf("%d", &choice);
		switch(choice)
		{
			case 1: createList(&start); //passing reference to head pointer so that changes reflect in the main()
			break;
			case 2: traverse(start);
			break;
			case 3: findMiddle(start);
			break;
			case 4: printf("\nEnter value of n: ");
					scanf("%d",&n);
					findnthfromend(start);
			break;
			case 5: printf("exiting loop...\n");
			break;
			default: printf("Wrong choice\n");
		}while(choice!=3);
	}
}

actual parameters are stored in stack space.
e.g.:
	add(2,13,15); 
	if 2 is in address 101, then 13 and 15 will be stored in 105 and 109 respectively. (int is 4 bytes)

ellipsis.c
#include<stdio.h>
int Add(int n,...)
{
	int *p = &n;
	int sum=0,i;
	for(i=0;i<n;i++);
	sum+=*(p+i);
	return sum;
}
int main()
{
	clrscr();
	printf("\n%d",Add(2,13,15));
	printf("\n%d",Add(3,13,15,20));
	printf("\n%d",Add(4,13,15,20,25));
	getch(); //to hold o/p in turbo C
}

here, due to the fact that parameters passed are stored in stack space, we can move pointers to navigate through them when in case of variable parameters w/o function overloading.

Q: what is coercion?
A: int x = 'A';
then x will be equal to 65.


printf(sizeof('A'));
o/p will be 4 bytes. (65 le lega)

conclusion:
	sizeof character literal ('A')= 4 bytes
	sizeof character variable (char c) = 1 byte

Q: what is trigraph characters?
A: 3 characters make up a single character. (for primitive keyboards)
eg:
	??- makes ~
	??= makes #

main syntax:-

int main(int argc, char *argv[], char *env[])
explaination: 
	command prompt window:-
	C:/> xyz 10 20 30 
	here xyz is the name of the executable file.
	so, argv[] array will store the above command like
		argv[0]=xyz
		argv[1]=10
		argv[2]=20
		argv[3]=30
	env[] will store the enviornment variables and its path (woi this pc ka properties wala)

Q: what is segment violation?
A: when the program tries to access a memory location which is not permitted to it.
