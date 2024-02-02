#include<iostream>
using namespace std;

int main()
{
	int number;
	cout<<"Enter the value number : ";
	cin>>number;
	
	int row=1;
	while(row<=number)
	{
		int space =row-1;
		while(space){
			cout<<" ";
			space--;
		}
		int column=1;
		while(column<=(number-row)+1){
			cout<<"* ";
			column++;
		}
		cout<<endl;
		row++;
	}
	return 0;
}

