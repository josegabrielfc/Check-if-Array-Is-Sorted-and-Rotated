#include <bits/stdc++.h>
using namespace std;

vector<int>& testCases(int size) { //genera un array de cardinalidad 5
        vector<int> arr;
        int aux = 0;

        int random = (int) (3 + rand() + 1);
        int rotate = (int) (4 + rand() + 1);

        switch (random) {
            case 1: // un arreglo totalmente aleatorio
                cout<<endl;
                for (int i = 0; i < size; i++) {
                    arr.push_back((int) (100 + rand() + 1));
                    cout<<arr[i]<<" "<<endl;
                }
                cout<<endl;
                break;
            case 2: // un arreglo ordenado/rotado
                aux = (int) (100 + rand() + 1);
                cout<<endl;
                for (int i = 0; i < size; i++) {
                    if (rotate == i) {
                        aux = (int) (100 + rand() + 1);
                    }
                    arr.push_back(aux);
                    aux++;
                    cout<<arr[i]<<" "<<endl;
                }
                cout<<endl;
                break;
            case 3: // un arreglo completamente ordenado
                aux = (int) (100 + rand() + 1);
                cout<<endl;
                for (int i = 0; i < size; i++) {
                    arr.push_back(aux);
                    aux++;
                    cout<<arr[i]<<" "<<endl;
                }
                cout<<endl;
                break;
        }

    return arr;
}
bool check(vector<int>& nums) {
    string arr = "";
    for (int i : nums) {
        arr += to_string(i) + " ";
    }
    sort(nums.begin(), nums.end());

    string arrSort = "";
    for (int j : nums) {
        arrSort += to_string(j) + " ";
    }
    string aux = arrSort + arrSort;
    bool check = aux.find(arr) != std::string::npos;
    return check;
}

int main(){
	int cases; cin>>cases;
	int size; cin>>size;
	cout<<std::boolalpha;
        while (cases--) {
            cout<<check(testCases(size))<<endl;
        }
        
	return 0;	
}