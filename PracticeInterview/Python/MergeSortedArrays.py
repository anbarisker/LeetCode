class MergeSortedArrays:

    def mergeSortedArrays(arr1,arr2):
        mergeArray = []
        array1Item = arr1[0]
        array2Item = arr2[0]
        count1 = 0
        count2 = 0
        while count1 < len(arr1) and count2 < len(arr2) :
            if arr1[count1] < arr2[count2] :
                mergeArray.append(arr1[count1])
                print(mergeArray)
                count1 = count1 + 1
                #array1Item = arr1[count1]
            else:
                mergeArray.append(arr2[count2])
                print(mergeArray)
                count2 = count2 + 1
                #array2Item = arr2[count2]
        mergeArray = mergeArray + arr1[count1:] + arr2[count2:]        
        for ii in mergeArray:
            print(ii)                                         
        
    mergeSortedArrays([0,3,4,31],[4,6,30])  
#0,3,4,4,6,30,31