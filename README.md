# 📰 News App

A dynamic news application developed using **Java**, **Flask**, and integrated with the **News API**. This app delivers the latest headlines and stories tailored to the user's preferences.

---

## Features

- Fetches real-time news using NewsAPI
- Personalized content based on user interests (e.g. sports, technology, health, etc.)
- Category-based filtering
- Simple and user-friendly interface
- Backend powered by Flask and Java integration

---

##  Tech Stack

| Tech         | Purpose                        |
|--------------|--------------------------------|
| Java         | Logic Layer / API Integration  |
| Flask (Python) | Backend server / Routing       |
| HTML, CSS    | Frontend UI                    |
| News API     | Real-time news data            |

---

##  Project Structure

News-app/
├── .idea/ # Project settings
├── NewsApp/ # Main source folder
│ ├── static/ # Static files (CSS/JS)
│ ├── templates/ # HTML pages
│ ├── app.py # Flask server
│ ├── newslogic.java # Java logic (example name)
│ └── ...
├── README.md # This file

yaml
Copy
Edit


---

## 🛠️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/news-app.git
cd news-app
2. Set Up Flask Environment
bash
Copy
Edit
cd NewsApp
python -m venv venv
# On Windows:
venv\Scripts\activate
# On Linux/Mac:
source venv/bin/activate
3. Install Python Dependencies
bash
Copy
Edit
pip install -r requirements.txt
4. Compile Java Code (if required)
Make sure you have Java installed. Compile any Java files if needed:

bash
Copy
Edit
javac newslogic.java
5. Run the Application
bash
Copy
Edit
python app.py
Go to http://localhost:5000 in your browser.

Customization
You can customize news content by editing the categories or preferences in:

newslogic.java (logic layer)

app.py (for routing/API handling)

Templates to change category dropdowns or themes

Future Improvements
Add user login and authentication

Save user preferences persistently

Add light/dark mode toggle
Add multi-language support

Screenshots
(Include UI screenshots here)

License
This project is open source under the MIT License.
