$(document).ready(function () {

    var classes = {
    };

    var constants = {
    };

    function initVars() {
    }

    function bindEvents() {
        $("table").on("click", "td", onFieldClick);
    }

    function init() {
        initVars();
        bindEvents();
        startGame();
    }

    function startGame() {
        $.ajax({
            method: 'POST',
            url: '/startGame',
            contentType: "application/json"
        });
    }


    /* Handlers */
    function onFieldClick() {
        var move = retrieveGameMove.call(this);

        $.ajax({
            method: 'POST',
            url: '/addGameMove',
            contentType: "application/json",
            data: JSON.stringify(move)
        });
    }

    /* Helpers */
    function retrieveGameMove() {
        var move = {
            gameId: 1,
            senderId: 1,
            type: "WIN",
            row: this.dataset.row - 1,
            col: this.dataset.col - 1
        };
        return move;
    }

    init();

});