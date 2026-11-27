balance=10000
PIN=1234
pin=int(input("Enter the PIN:"))
if(pin==PIN):
    print("1.Check Balance\n2.Withdraw Money\n3.Deposit Money")
    choice=int(input("Enter the Choice:"))
    if(choice==1):
        print(balance)
    elif(choice==2):
        withdraw=int(input("Enter the Amount to withdraw:"))
        if(withdraw>balance):
            print("Amount Exceeds Balance")
        else:
            balance-=withdraw
            print(f"Available Balance:{balance}")
    elif(choice==3):
        deposit=int(input("Enter the amount to deposit:"))
        balance+=deposit
        print(f"Balance:{balance}")
    else:
        print("Choice is out of reach")
else:
    print("Pin is Incorrect")
