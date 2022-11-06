var stompClient = null;
var roomOld = ""
// function setConnected(connected) {
connected = true;
var socket = new SockJS('/gs-guide-websocket');
stompClient = Stomp.over(socket);
stompClient.connect({}, function (frame) {
    // console.log('Connected: ' + frame);
    stompClient.subscribe('/topic/room', function (room) {
        showSelected(JSON.parse(room.body));
    });
});

function selectedChange() {
    var select = document.getElementById("chooseRoom").value;
    stompClient.send("/app/room-message", {}, JSON.stringify({'roomNew': select, 'roomOld': roomOld}));
}

function showSelected(room) {
    console.log("old " + room.contentOld)
    console.log("new " + room.contentNew)
    document.querySelectorAll("#chooseRoom option").forEach(opt => {
        if (opt.value == room.contentNew) {
            opt.disabled = true;
        }
        if (opt.value == room.contentOld) {
            opt.disabled = false;
        }
    });
    roomOld = room.contentNew;
}

function submit() {
    console.log("submit ne")
    // stompClient.send("/app/room-message", {}, JSON.stringify({'room': $('#chooseRoom :selected').val()}));
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $("#submit").click(() => {
        submit();
    });
});