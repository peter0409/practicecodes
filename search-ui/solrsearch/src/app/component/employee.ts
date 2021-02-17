export class Employee{
    id : String;
    name : String;
    address : String;

    constructor(obj ?: any) {
        this.id = obj && obj.id || null;
        this.name = obj && obj.name || null;
        this.address = obj && obj.address || null;
    }
}