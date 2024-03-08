let handleId= 0;
let second = 1;
let minute = 0;
let hour = 0;
const h1 = document.getElementById("time");
const go = document.getElementById("go");
const stop = document.getElementById("stop");
const time = `${minute}:${second++}`


go.onclick = function(){
    if(handleId==0){
        handleId = setInterval(function start(){
            h1.textContent = `${hour}:${minute}:${second}`
            second ++;
            if(second>59){
                minute++;
                second=0;
            }
            if(minute>59){
                hour++;
                minute=0;
            }
        },1)
    }
}

stop.onclick = function(){
    clearInterval(handleId);
    handleId = 0;
}