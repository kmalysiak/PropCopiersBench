Below are the results of Benchmark run on my machine. 

Among deep copiers - mapstruct is the fastest. 

Among shallow copiers - jaxson is the winner.

Benchmark Mode Cnt Score Error Units 

Deep copiers 

jackson avgt 3 304,657 ± 95,358 us/op 

gson    avgt 3 645,878 ± 464,097 us/op

Shallow copiers 

maspstruct               avgt 3  1,368 ± 1,201 us/op 

BeanUtils.copyProperties avgt 3 62,899 ± 62,347 us/op


