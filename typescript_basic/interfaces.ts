//Javascript doesnt have interface, only typescript

interface User {
	username: string;
	password: string;
	confirmPassword?: string; //optional field
}

let user: User;

//This value does satisfy the interface
user = { username: 'Md', password: '1234'}

//not allowed will give error
// user = { anything: 'Md', password: '1234'}

