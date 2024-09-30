package com.example.irregular_verbs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.irregular_verbs.ui.theme.Irregular_verbsTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Irregular_verbsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    VerbQuiz(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

// Список неправильных глаголов
val irregularVerbs = listOf(
    Triple("be", "was/were", "been") to "быть",
    Triple("beat", "beat", "beaten") to "бить",
    Triple("become", "became", "become") to "становиться",
    Triple("begin", "began", "begun") to "начинать",
    Triple("bend", "bent", "bent") to "гнуть",
    Triple("bet", "bet", "bet") to "держать пари",
    Triple("bind", "bound", "bound") to "связывать",
    Triple("bite", "bit", "bitten") to "кусать",
    Triple("bleed", "bled", "bled") to "кровоточить",
    Triple("blow", "blew", "blown") to "дуть",
    Triple("break", "broke", "broken") to "ломать",
    Triple("bring", "brought", "brought") to "приносить",
    Triple("build", "built", "built") to "строить",
    Triple("buy", "bought", "bought") to "покупать",
    Triple("catch", "caught", "caught") to "ловить",
    Triple("choose", "chose", "chosen") to "выбирать",
    Triple("come", "came", "come") to "приходить",
    Triple("cost", "cost", "cost") to "стоить",
    Triple("cut", "cut", "cut") to "резать",
    Triple("deal", "dealt", "dealt") to "иметь дело",
    Triple("dig", "dug", "dug") to "копать",
    Triple("do", "did", "done") to "делать",
    Triple("draw", "drew", "drawn") to "рисовать",
    Triple("dream", "dreamt", "dreamt") to "мечтать",
    Triple("drink", "drank", "drunk") to "пить",
    Triple("drive", "drove", "driven") to "водить",
    Triple("eat", "ate", "eaten") to "есть",
    Triple("fall", "fell", "fallen") to "падать",
    Triple("feed", "fed", "fed") to "кормить",
    Triple("feel", "felt", "felt") to "чувствовать",
    Triple("fight", "fought", "fought") to "драться",
    Triple("find", "found", "found") to "находить",
    Triple("fly", "flew", "flown") to "летать",
    Triple("forget", "forgot", "forgotten") to "забывать",
    Triple("forgive", "forgave", "forgiven") to "прощать",
    Triple("freeze", "froze", "frozen") to "замерзать",
    Triple("get", "got", "gotten") to "получать",
    Triple("give", "gave", "given") to "давать",
    Triple("go", "went", "gone") to "идти",
    Triple("grow", "grew", "grown") to "расти",
    Triple("hang", "hung", "hung") to "вешать",
    Triple("have", "had", "had") to "иметь",
    Triple("hear", "heard", "heard") to "слышать",
    Triple("hide", "hid", "hidden") to "прятать",
    Triple("hit", "hit", "hit") to "ударять",
    Triple("hold", "held", "held") to "держать",
    Triple("hurt", "hurt", "hurt") to "ранить",
    Triple("keep", "kept", "kept") to "хранить",
    Triple("know", "knew", "known") to "знать",
    Triple("lay", "laid", "laid") to "класть",
    Triple("lead", "led", "led") to "вести",
    Triple("learn", "learnt", "learnt") to "учить",
    Triple("leave", "left", "left") to "покидать",
    Triple("lend", "lent", "lent") to "одалживать",
    Triple("let", "let", "let") to "позволять",
    Triple("lie", "lay", "lain") to "лежать",
    Triple("light", "lit", "lit") to "зажигать",
    Triple("lose", "lost", "lost") to "терять",
    Triple("make", "made", "made") to "делать",
    Triple("mean", "meant", "meant") to "означать",
    Triple("meet", "met", "met") to "встречать",
    Triple("pay", "paid", "paid") to "платить",
    Triple("put", "put", "put") to "класть",
    Triple("read", "read", "read") to "читать",
    Triple("ride", "rode", "ridden") to "ездить верхом",
    Triple("ring", "rang", "rung") to "звонить",
    Triple("rise", "rose", "risen") to "подниматься",
    Triple("run", "ran", "run") to "бегать",
    Triple("say", "said", "said") to "сказать",
    Triple("see", "saw", "seen") to "видеть",
    Triple("sell", "sold", "sold") to "продавать",
    Triple("send", "sent", "sent") to "посылать",
    Triple("set", "set", "set") to "устанавливать",
    Triple("shake", "shook", "shaken") to "трясти",
    Triple("shine", "shone", "shone") to "светить",
    Triple("shoot", "shot", "shot") to "стрелять",
    Triple("show", "showed", "shown") to "показывать",
    Triple("shut", "shut", "shut") to "закрывать",
    Triple("sing", "sang", "sung") to "петь",
    Triple("sit", "sat", "sat") to "сидеть",
    Triple("sleep", "slept", "slept") to "спать",
    Triple("speak", "spoke", "spoken") to "говорить",
    Triple("spend", "spent", "spent") to "тратить",
    Triple("stand", "stood", "stood") to "стоять",
    Triple("steal", "stole", "stolen") to "красть",
    Triple("stick", "stuck", "stuck") to "приклеивать",
    Triple("strike", "struck", "struck") to "ударять",
    Triple("swear", "swore", "sworn") to "клясться",
    Triple("sweep", "swept", "swept") to "подметать",
    Triple("swim", "swam", "swum") to "плавать",
    Triple("take", "took", "taken") to "брать",
    Triple("teach", "taught", "taught") to "учить",
    Triple("tear", "tore", "torn") to "рвать",
    Triple("tell", "told", "told") to "рассказывать",
    Triple("think", "thought", "thought") to "думать",
    Triple("throw", "threw", "thrown") to "бросать",
    Triple("understand", "understood", "understood") to "понимать",
    Triple("wake", "woke", "woken") to "будить",
    Triple("wear", "wore", "worn") to "носить",
    Triple("win", "won", "won") to "выигрывать",
    Triple("write", "wrote", "written") to "писать"
)


@Composable
fun VerbQuiz(modifier: Modifier = Modifier) {
    var isTranslateMode by remember { mutableStateOf(true) }  // Режим: перевод или формы глаголов
    var currentVerb by remember { mutableStateOf(irregularVerbs.random()) }
    var userInput by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }
    var question by remember { mutableStateOf("") }
    var correctCount by remember { mutableStateOf(0) }
    var incorrectCount by remember { mutableStateOf(0) }

    // Генерация вопроса
    LaunchedEffect(isTranslateMode, currentVerb) {
        if (isTranslateMode) {
            question = "Введите перевод глагола: ${currentVerb.first.first}"
        } else {
            question = "Введите три формы глагола через запятую для: ${currentVerb.second}"
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = question, style = MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = userInput,
            onValueChange = { userInput = it },
            label = { Text("Ваш ответ") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            if (isTranslateMode) {
                // Проверка перевода
                if (userInput.trim().lowercase() == currentVerb.second.lowercase()) {
                    result = "Правильно!"
                    correctCount++
                } else {
                    result = "Неправильно! Правильный ответ: ${currentVerb.second}"
                    incorrectCount++
                }
            } else {
                // Проверка трёх форм
                val forms = userInput.split(",").map { it.trim() }
                if (forms.size == 3 &&
                    forms[0].lowercase() == currentVerb.first.first.lowercase() &&
                    forms[1].lowercase() == currentVerb.first.second.lowercase() &&
                    forms[2].lowercase() == currentVerb.first.third.lowercase()) {
                    result = "Правильно!"
                    correctCount++
                } else {
                    result = "Неправильно! Правильные формы: ${currentVerb.first.first}, ${currentVerb.first.second}, ${currentVerb.first.third}"
                    incorrectCount++
                }
            }
            // Смена режима
            isTranslateMode = !isTranslateMode
            currentVerb = irregularVerbs.random()  // Новый рандомный глагол
            userInput = ""  // Очистка поля ввода
        }) {
            Text("Проверить")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = result, style = MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.height(16.dp))

        // Показать счётчики правильных и неправильных ответов
        Text(text = "Правильные ответы: $correctCount", style = MaterialTheme.typography.bodyLarge)
        Text(text = "Ошибки: $incorrectCount", style = MaterialTheme.typography.bodyLarge)

        Spacer(modifier = Modifier.height(16.dp))

        // Кнопка сброса счётчиков
        Button(onClick = {
            correctCount = 0
            incorrectCount = 0
            result = ""
        }) {
            Text("Сбросить счётчики")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VerbQuizPreview() {
    Irregular_verbsTheme {
        VerbQuiz()
    }
}