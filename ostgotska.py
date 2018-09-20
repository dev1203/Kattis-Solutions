input_line = input().strip().split()
count = 0
for val in input_line:
    if 'ae' in val:
        count = count + 1
if count/len(input_line) * 10 >= 4:
    print("dae ae ju traeligt va")
else:
    print('haer talar vi rikssvenska')