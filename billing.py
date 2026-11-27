name=input("Customer Name:")
product_prize=int(input("Enter the price:"))
quantity=int(input("Enter the Quantity:"))
total=product_prize*quantity
discount=total*0.1
final_price=total-discount
print("CUSTOMER BILL")
print("------------------------")
print(f"Customer:{name}")
print(f"Price:{product_prize}")
print(f"Quantity:{quantity}")
print(f"Total:{total}")
print(f"Discount:{discount}")
print(f"Final Amount:{final_price}")
 